package com.dmxiaoshen.common.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by hzhsg on 2018/6/25.
 */
public class JacksonUtilsTest {
    @Test
    public void toJson() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("1","水果");
        Assert.assertEquals("{\"1\":\"水果\"}",JacksonUtils.toJson(map));
    }

}