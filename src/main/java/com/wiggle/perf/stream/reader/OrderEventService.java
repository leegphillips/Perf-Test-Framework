package com.wiggle.perf.stream.reader;

import com.wiggle.perf.Connection;
import com.wiggle.perf.repository.OrderEventRepository;
import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2003;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class OrderEventService extends AbstractStreamReader {
    private static final Log logger = LogFactory.getLog(OrderEventService.class);;

    @Autowired
    private OrderEventRepository repo;

    @Autowired
    private Connection connection;

    @Scheduled(fixedDelay = 100)
    public void scan() throws InterruptedException {
        doScan(OrderEventService.class);
    }

    @Override
    protected String process() throws ApiException {
        InlineResponse2003 response = connection.getOrdersApi().ordersGet(from, 1000);
        repo.save(response.getPage());
        return response.getNextLink();
    }
}
