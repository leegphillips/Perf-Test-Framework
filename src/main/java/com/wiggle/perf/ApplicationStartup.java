package com.wiggle.perf;

import com.wiggle.perf.repository.AvailabilityRepository;
import com.wiggle.perf.repository.ItemRepository;
import com.wiggle.perf.repository.OrderEventRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
    private static final Log logger = LogFactory.getLog(ApplicationStartup.class);;

    @Autowired
    private ItemRepository items;

    @Autowired
    private OrderEventRepository events;

    @Autowired
    private AvailabilityRepository availability;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        items.deleteAll();
        events.deleteAll();
        availability.deleteAll();
        logger.info("Collections emptied");
    }
}
