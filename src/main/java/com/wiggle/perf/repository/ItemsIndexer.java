package com.wiggle.perf.repository;

import io.swagger.client.model.InlineResponse2002Page;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class ItemsIndexer extends AbstractMongoEventListener<InlineResponse2002Page> {
    private static final Log logger = LogFactory.getLog(ItemsIndexer.class);

    @Override
    public void onBeforeConvert(BeforeConvertEvent<InlineResponse2002Page> event) {
        Long id = Long.valueOf(event.getSource().getItem().getItemId());
        event.getSource().setItemId(id);
        logger.trace(id);
        super.onBeforeConvert(event);
    }
}
