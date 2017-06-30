package com.wiggle.perf.model;

import com.google.gson.Gson;
import io.swagger.client.model.Order;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class OrderFactory {
    public Order create(Resource file) throws IOException {
        try (InputStream input = file.getInputStream()) {
            Order order = new Gson().fromJson(IOUtils.toString(input, Charset.defaultCharset()), Order.class);
            order.setOriginalOrderId("TEST-" + RandomStringUtils.randomNumeric(8));
            order.getPaymentDetails().stream().filter(payment -> payment.getBraintree() != null).forEach(payment -> payment.getBraintree().getTransaction().setId(RandomStringUtils.randomNumeric(8)));
            return order;
        }
    }
}
