package com.dmxiaoshen.common.utils.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by hzhsg on 2018/6/19.
 */
public class BubbleSortUtilsTest {
    @Test
    public void sortUp() throws Exception {
        int[] a = new int[]{101,3,2,9,1,6,7,5,11,23,45,32};
        BubbleSortUtils.sortUp(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void sortDown() throws Exception {
        int[] a = new int[]{101,3,2,9,1,6,7,5,11,23,45,32};
        BubbleSortUtils.sortDown(a);
        System.out.println(Arrays.toString(a));
    }

}