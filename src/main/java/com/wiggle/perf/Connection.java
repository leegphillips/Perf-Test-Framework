package com.wiggle.perf;

import io.swagger.client.ApiClient;
import io.swagger.client.api.AvailibilityApi;
import io.swagger.client.api.ItemsApi;
import io.swagger.client.api.OrdersApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Connection {
    private ItemsApi itemsApi;
    private OrdersApi ordersApi;
    private AvailibilityApi availibilityApi;

    @Value("${base.url}")
    private String baseUrl;

    @Value("${access.token}")
    private String accessToken;

    @PostConstruct
    public void doConnection() {
        ApiClient client = new ApiClient();
        client.setAccessToken(accessToken);
        client.setBasePath(baseUrl);
        itemsApi = new ItemsApi(client);
        ordersApi = new OrdersApi(client);
        availibilityApi = new AvailibilityApi(client);
    }

    public ItemsApi getItemsApi() {
        return itemsApi;
    }

    public OrdersApi getOrdersApi() {
        return ordersApi;
    }

    public AvailibilityApi getAvailibilityApi() {
        return availibilityApi;
    }
}
