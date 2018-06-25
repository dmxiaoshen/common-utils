package com.dmxiaoshen.common.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hzhsg on 2018/6/21.
 */
public class ConfigPropertiesUtilsTest {
    @Test
    public void get() throws Exception {
        Assert.assertTrue("33".equals(ConfigPropertiesUtils.get("test.properties","app.id")));
        Assert.assertTrue("code33".equals(ConfigPropertiesUtils.get("test.properties","app.code")));
    }

}