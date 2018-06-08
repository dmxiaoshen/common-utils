package com.dmxiaoshen.common.utils;

import java.util.UUID;

/**
 * Created by hzhsg on 2018/6/8.
 */
public class IdGenUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
