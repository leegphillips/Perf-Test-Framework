package com.wiggle.perf;

import io.swagger.client.ApiException;
import io.swagger.client.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class OrderService {
    @Autowired
    private Connection connection;

    @Async
    public CompletableFuture<Object> post(Order order) throws InterruptedException, ApiException {
        return CompletableFuture.completedFuture(connection.getOrdersApi().ordersPost(order));
    }
}
