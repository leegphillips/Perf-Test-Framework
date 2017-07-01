package com.wiggle.perf.model;

import io.swagger.client.model.Order;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Tests")
public class PerfTest extends ResourceSupport {

    public Long getTestId() {
        return id;
    }

    private Long id = System.currentTimeMillis();

    public List<Order> getOrders() {
        return orders;
    }

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
}
