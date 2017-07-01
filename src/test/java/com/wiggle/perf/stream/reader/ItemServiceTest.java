package com.wiggle.perf.stream.reader;

import com.wiggle.perf.Connection;
import com.wiggle.perf.repository.ItemRepository;
import io.swagger.client.ApiException;
import io.swagger.client.api.ItemsApi;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2002Page;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

public class ItemServiceTest {
    ItemService test = new ItemService();

    @Before
    public void before() {
        test.connection = mock(Connection.class);
        test.repo = mock(ItemRepository.class);
    }

    @Test
    public void testProcess() throws ApiException {
        ItemsApi api = mock(ItemsApi.class);
        List<InlineResponse2002Page> items = Collections.singletonList(mock(InlineResponse2002Page.class));
        InlineResponse2002 response = new InlineResponse2002();
        response.setPage(items);
        when(api.itemsGet(0L, 50)).thenReturn(response);
        when(test.connection.getItemsApi()).thenReturn(api);
        test.process();
        verify(test.repo).save(items);
    }
}
