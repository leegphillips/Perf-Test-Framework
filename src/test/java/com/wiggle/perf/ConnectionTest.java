package com.wiggle.perf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConnectionTest {

    @Autowired
    private Connection connection;

    @Test
    public void checkConnectionInit() {
        Assert.notNull(connection.getAvailibilityApi());
        Assert.notNull(connection.getOrdersApi());
        Assert.notNull(connection.getItemsApi());
    }
}
