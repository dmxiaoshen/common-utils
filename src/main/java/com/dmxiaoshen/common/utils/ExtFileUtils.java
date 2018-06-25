package com.dmxiaoshen.common.utils;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzhsg on 2018/6/21.
 */
public class ExtFileUtils extends FileUtils{

    public static List<String> readToList(String filePath) throws FileNotFoundException,IOException {
        List<String> result = new ArrayList<>();
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        String str = null;
        while ((str=in.readLine())!=null){
            result.add(str);
        }
        return result;
    }

    public static void writeToFile(List<String> rowList,String filePath,boolean append) throws IOException{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePath,append)));
        for(String str:rowList){
            out.println(str);
        }
        out.flush();
        out.close();
    }

}
