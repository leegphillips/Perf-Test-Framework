package com.wiggle.perf;

import com.google.gson.Gson;
import com.wiggle.perf.repository.ItemRepository;
import io.swagger.client.model.InlineResponse2002Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRepoTest {

    PodamFactory factory = new PodamFactoryImpl();

    @Autowired
    private ItemRepository repo;

    @Test
    public void assertSaveAlsoUpdates() {
        InlineResponse2002Page item = factory.manufacturePojoWithFullData(InlineResponse2002Page.class);
        repo.save(item);
        InlineResponse2002Page fetch = repo.findOne(item.getItemId());
        Assert.assertEquals(new Gson().toJson(item), new Gson().toJson(fetch));

        long newValue = fetch.getSequenceId().longValue() + 1;
        fetch.setSequenceId(newValue);
        repo.save(fetch);

        InlineResponse2002Page fetch2 = repo.findOne(item.getItemId());
        Assert.assertTrue(fetch2.getSequenceId() == newValue);
    }
}
