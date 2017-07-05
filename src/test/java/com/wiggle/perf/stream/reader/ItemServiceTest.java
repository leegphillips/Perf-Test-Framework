package com.wiggle.perf.stream.reader;

import com.wiggle.perf.Connection;
import com.wiggle.perf.PerfApplication;
import com.wiggle.perf.repository.ItemRepository;
import io.swagger.client.api.ItemsApi;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2002Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PerfApplication.class})
public class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @Mock
    private Connection connection;

    @Test
    public void testProcess() throws Exception {
        final ItemsApi api = mock(ItemsApi.class);
        final InlineResponse2002 response = mock(InlineResponse2002.class);
        final List<InlineResponse2002Page> responsePage = Arrays.asList(mock(InlineResponse2002Page.class));
        final ItemService itemService = new ItemService(itemRepository, connection);
        when(connection.getItemsApi()).thenReturn(api);
        when(api.itemsGet(anyLong(), anyInt())).thenReturn(response);
        when(response.getPage()).thenReturn(responsePage);
        itemService.process();
        verify(connection).getItemsApi();
        verify(api).itemsGet(anyLong(), anyInt());
        verify(response).getPage();
        verify(itemRepository).save(responsePage);
    }
}
