package com.dmxiaoshen.common.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hzhsg on 2018/6/8.
 */
public class IdGenUtilsTest {
    @Test
    public void getUUID() throws Exception {
        Assert.assertTrue(IdGenUtils.getUUID().length() == 32);
    }

}