/*
 * Wiggle.DataPortals.CRC.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Ignore
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    
    /**
     * Gets page from order event stream
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ordersGetTest() throws ApiException {
        Long from = null;
        Integer take = null;
        InlineResponse2003 response = api.ordersGet(from, take);

        // TODO: test validations
    }
    
    /**
     * Allows to place a headless order into the Wiggle OMS.
     *
     * The Wiggle OMS requires a linked Customer account to process an Order.  Therefore, each Order object pushed to WiggleCore will have an inner Customer object to create a ghost customer account if required.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ordersPostTest() throws ApiException {
        Order order = null;
        Object response = api.ordersPost(order);

        // TODO: test validations
    }
    
}
