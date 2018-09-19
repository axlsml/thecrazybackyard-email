package com.bockig.crazybackyard.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MetaDataTest {

    private Map<String, String> complete = new HashMap<>();

    @Before
    public void setUp() {
        this.complete.put(MetaData.UTC, "1536660625500");
    }

    @Test
    public void testNormal() throws Exception {
        Assert.assertEquals("Hey buddy! (12:10:25 PM) #trailcam", MetaData.buildStatusText(complete));
        Assert.assertEquals("Hey buddy! #trailcam", MetaData.buildStatusText(new HashMap<>()));
    }
}
