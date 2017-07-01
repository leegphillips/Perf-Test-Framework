package com.wiggle.perf.stream.reader;

import com.wiggle.perf.Connection;
import com.wiggle.perf.repository.AvailabilityRepository;
import io.swagger.client.ApiException;
import io.swagger.client.api.AvailibilityApi;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AvailabilityServiceTest {
    AvailabilityService test = new AvailabilityService();

    @Before
    public void before() {
        test.connection = mock(Connection.class);
        test.repo = mock(AvailabilityRepository.class);
    }

    @Test
    public void testProcess() throws ApiException {
        AvailibilityApi api = mock(AvailibilityApi.class);
        List<InlineResponse200> availability = Collections.singletonList(mock(InlineResponse200.class));
        InlineResponse2001 response = new InlineResponse2001();
        response.setPage(availability);
        when(api.availibilityGet(0L, 1000)).thenReturn(response);
        when(test.connection.getAvailibilityApi()).thenReturn(api);
        test.process();
        verify(test.repo).save(availability);
    }
}
