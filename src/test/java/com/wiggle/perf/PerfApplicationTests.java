package com.wiggle.perf;

import com.wiggle.perf.model.OrderFactory;
import com.wiggle.perf.model.PerfTest;
import com.wiggle.perf.repository.PerfTestRepository;
import io.swagger.client.ApiException;
import io.swagger.client.api.OrdersApi;
import io.swagger.client.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PerfApplicationTests {

    @Autowired
    private Connection connection;

    @Autowired
    private PerfTestRepository perfTestRepository;

    @Value(value = "classpath:Braintree.json")
    private Resource braintree;

    @Test
    public void simpleOrder() throws IOException, ApiException {
        PerfTest perfTest = new PerfTest();
        for (int i = 0; i < 5; i++) {
            Order order = new OrderFactory().create(braintree);
            Object o = connection.getOrdersApi().ordersPost(order);
            perfTest.addOrder(order);
        }
        this.perfTestRepository.save(perfTest);
    }
}
