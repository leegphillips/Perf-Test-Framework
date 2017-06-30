package com.wiggle.perf;

import com.wiggle.perf.model.OrderFactory;
import com.wiggle.perf.model.PerfTest;
import com.wiggle.perf.repository.PerfTestRepository;
import io.swagger.client.model.Order;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {
    @Autowired
    PerfTestRepository perfTestRepository;

    @Value(value = "classpath:Braintree.json")
    private Resource braintree;

    public PerfTest createPerfTest() throws IOException {
        PerfTest perfTest = new PerfTest();
        for (int i = 0; i < 5; i++) {
            Order order = new OrderFactory().create(braintree);
            perfTest.addOrder(order);
        }
        this.perfTestRepository.save(perfTest);
        return perfTest;
    }

    @Test
    public void assertPerfTestCreate() throws IOException {
        PerfTest perfTest = createPerfTest();
        Assert.notNull(perfTestRepository.findOne(perfTest.getTestId()));
    }
}
