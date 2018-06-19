package com.dmxiaoshen.common.utils.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by hzhsg on 2018/6/19.
 */
public class InsertionSortUtilsTest {
    @Test
    public void sort() throws Exception {
        int[] a = new int[]{101,3,2,9,1,6,7,5,11,23,45,32};
        InsertionSortUtils.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void sort2() throws Exception {
        int[] a = new int[]{101,3,2,9,1,6,7,5,11,23,45,32};
        InsertionSortUtils.sort2(a);
        System.out.println(Arrays.toString(a));
    }

}