package com.craaaaazy.demo013;

import java.io.IOException;

public class DemoInput {
    public static void main(String[] args) {
        try {
            // System.in是标准输入流，是InputStream类的对象
            // read()方法是等待输入数据
            int test = System.in.read();
            System.out.println(test);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
