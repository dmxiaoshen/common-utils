package com.dmxiaoshen.common.utils;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hzhsg on 2018/6/21.
 */
public class ExtFileUtilsTest {

    @Test
    public void readLines() {
        String path = this.getClass().getResource("/").getFile() + File.separator + "a.txt";
        try {
            List<String> result = ExtFileUtils.readLines(new File(path), "utf-8");
            System.out.println(Arrays.toString(result.toArray()));
        } catch (IOException e) {
            throw new RuntimeException("file readLines error");
        }
    }

    @Test
    public void write() {
        String path = this.getClass().getResource("/").getFile() + File.separator + "a.txt";
        try {
            List<String> s = Arrays.asList("王杰");
            ExtFileUtils.writeLines(new File(path), "utf-8", s, true);
        } catch (IOException e) {
            throw new RuntimeException("file write error");
        }
    }

}