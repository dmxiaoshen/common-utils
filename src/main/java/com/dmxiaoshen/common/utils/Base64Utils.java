package com.dmxiaoshen.common.utils;

import java.util.Base64;

/**
 * Created by hzhsg on 2018/1/10.
 */
public class Base64Utils {

    private static byte[] base64StringToByte(String str){
        byte[] source = Base64.getEncoder().encode(str.getBytes());
        return Base64.getDecoder().decode(source);
    }

    private static String base64ByteToString(byte[] bytes){
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String stringToBase64(String str){
        return new String(base64StringToByte(str));
    }

    public static String stringFromBase64(String str){
        return base64ByteToString(str.getBytes());
    }
}
