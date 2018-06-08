package com.dmxiaoshen.common.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hzhsg on 2018/6/8.
 */
public class ExtStringUtilsTest {

    @Test
    public void join(){
        Assert.assertEquals("jack-pot", ExtStringUtils.join(new String[]{"jack","pot"},"-"));
    }

}