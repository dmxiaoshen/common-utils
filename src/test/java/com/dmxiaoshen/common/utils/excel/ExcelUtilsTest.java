package com.dmxiaoshen.common.utils.excel;

import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by hzhsg on 2018/6/8.
 */
public class ExcelUtilsTest {
    @Test
    public void importExcel() throws Exception {
        URL path = this.getClass().getResource("/");
        File file = new File(path.getFile() + File.separator + "黑名单统计表4.xls");
        List<String[][]> result = ExcelUtils.importExcel(file);
        System.out.println(result.size());
    }

}