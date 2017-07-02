package com.wiggle.perf.controller;

import com.wiggle.perf.Connection;
import com.wiggle.perf.OrderService;
import com.wiggle.perf.model.OrderFactory;
import com.wiggle.perf.model.PerfTest;
import com.wiggle.perf.repository.OrderEventRepository;
import com.wiggle.perf.repository.PerfTestRepository;
import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2003Page;
import io.swagger.client.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class WebController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PerfTestRepository testsRepo;

    @Autowired
    private OrderEventRepository eventsRepo;

    @Autowired
    private Connection connection;

    @Value(value = "classpath:Braintree.json")
    private Resource braintree;

    @RequestMapping("/ping")
    public String ping() {
        return String.valueOf(System.currentTimeMillis());
    }

    @RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PerfTest> index() throws IOException, ApiException {
        List<PerfTest> tests = testsRepo.findAll();
        tests.stream()
                .forEach(test -> test.add(linkTo(methodOn(WebController.class).testDetails(test.getTestId()))
                        .withRel("test")));
        return tests;
    }

    @RequestMapping(value = "/test/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PerfTest testDetails(@PathVariable("id") long id) {
        PerfTest test = testsRepo.findOne(id);
        test.getOrders().stream().forEach(order -> test.add(linkTo(methodOn(WebController.class).order(order.getOrderId()))
                .withRel(order.getOrderId())));
        return test;
    }

    @RequestMapping(value = "/order/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order order(@PathVariable("id") String id) {
        Order order = testsRepo.findContainingOrder(id)
                .getOrders().stream()
                .filter(item -> item.getOrderId().equals(id))
                .findFirst().get();
        order.add(linkTo(methodOn(WebController.class).orderEvents(order.getOrderId()))
                .withRel("events"));
        return order;
    }

    @RequestMapping(value = "/order/{id}/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InlineResponse2003Page> orderEvents(@PathVariable("id") String id) {
        return eventsRepo.findAll(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createPerfTest(HttpServletResponse response, @ModelAttribute("count") int count) throws IOException, ApiException, InterruptedException {
        PerfTest perfTest = new PerfTest();
        List<CompletableFuture<Object>> posts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Order order = new OrderFactory().create(braintree);
            posts.add(orderService.post(order));
            perfTest.addOrder(order);
        }
        this.testsRepo.save(perfTest);
        CompletableFuture.allOf(posts.toArray(new CompletableFuture[posts.size()]));
        response.sendRedirect("/test/" + perfTest.getTestId());
    }

    @RequestMapping(value = "/")
    public void createView(HttpServletResponse response) throws IOException {
        String form = "<html><body><form action=\"/create\" method=\"post\">\n" +
                "Count: <input type=\"text\" name=\"count\"><br>\n" +
                "<input type=\"submit\" value=\"Create New Orders\">\n" +
                "</form></body></html>";
        response.getWriter().println(form);
    }
}
