package com.craaaaazy.demo015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoSwitch2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数字：");

        try {
            String inputString = reader.readLine();
            int i = Integer.valueOf(inputString);

            switch (i) {
                case 1:
                    System.out.println("我执行了逻辑1");
                case 2:
                    System.out.println("我执行了逻辑2");
                case 3:
                    System.out.println("我执行了逻辑3");
                default:
                    System.out.println("我执行了默认逻辑");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
