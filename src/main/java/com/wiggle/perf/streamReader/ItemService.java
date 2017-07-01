package com.wiggle.perf.streamReader;

import com.wiggle.perf.Connection;
import com.wiggle.perf.repository.ItemRepository;
import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2002;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends AbstractStreamReader {
    private static final Log logger = LogFactory.getLog(ItemService.class);;

    @Autowired
    private ItemRepository repo;

    @Autowired
    private Connection connection;

    @Scheduled(fixedDelay = 100)
    public void scan() throws InterruptedException {
        doScan(ItemService.class);
    }

    @Override
    protected String process() throws ApiException {
        InlineResponse2002 response = connection.getItemsApi().itemsGet(from, 50);
//        for (InlineResponse2002Page item : response.getPage()) {
//            if (repo.exists(Long.valueOf(item.getItem().getItemId()))) {
//                repo.delete(item);
//            }
//        }
        repo.save(response.getPage());
        return response.getNextLink();
    }
}
