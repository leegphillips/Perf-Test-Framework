package com.wiggle.perf.streamReader;

import com.wiggle.perf.Connection;
import com.wiggle.perf.repository.AvailabilityRepository;
import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2001;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AvailabilityService extends AbstractStreamReader {
    private static final Log logger = LogFactory.getLog(AvailabilityService.class);

    @Autowired
    AvailabilityRepository repo;

    @Autowired
    Connection connection;

    @Scheduled(fixedDelay = 100)
    public void scan() throws InterruptedException {
        doScan(AvailabilityService.class);
    }

    @Override
    protected String process() throws ApiException {
        InlineResponse2001 response = connection.getAvailibilityApi().availibilityGet(from, 1000);
        repo.save(response.getPage());
        return response.getNextLink();
    }
}
