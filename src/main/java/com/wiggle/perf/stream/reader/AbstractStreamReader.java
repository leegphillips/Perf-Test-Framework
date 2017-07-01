package com.wiggle.perf.stream.reader;

import io.swagger.client.ApiException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractStreamReader {
    private static final Log logger = LogFactory.getLog(AbstractStreamReader.class);;

    private static final String MARKER = "from=";

    protected long from = 0;

    protected void doScan(Class<?> aClass) throws InterruptedException {
        try {
            long start = System.currentTimeMillis();
            String next = process();
            from = Long.valueOf(next.substring(next.indexOf(MARKER) + MARKER.length()));
            logger.info(next + "  Query time: " + (System.currentTimeMillis() - start) / 1000 + "s");
        } catch (ApiException e) {
            logger.trace(aClass.getCanonicalName() + ": Nothing new");
            Thread.sleep(10000);
        }
    }

    protected abstract String process() throws ApiException;
}
