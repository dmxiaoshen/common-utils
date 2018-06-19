package com.dmxiaoshen.common.utils.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by hzhsg on 2018/6/19.
 */
public class SelectionSortUtilsTest {
    @Test
    public void sort() throws Exception {
        int[] a = new int[]{2,6,4,8,12,13,54,32,41,9};
        SelectionSortUtils.sort(a);
        System.out.println(Arrays.toString(a));
    }

}