package com.wiggle.perf.stream.reader;

import com.wiggle.perf.PerfApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PerfApplication.class})
public class ItemServiceFunctionalTest {

    @Mock
    private ItemService itemService;

    @Test
    public void test() throws Exception {
        // this should be replaced with actual data
        when(itemService.process()).thenReturn("abcd");
        String result = itemService.process();
        Assert.assertEquals("abcd", result);
    }

}