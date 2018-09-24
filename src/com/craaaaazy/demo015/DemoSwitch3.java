package com.craaaaazy.demo015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoSwitch3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数字：");

        try {
            String inputString = reader.readLine();
            int i = Integer.valueOf(inputString);

            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println(i + " * 10 = " + (i * 10));
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println(i + " * 20 = " + (i * 10));
                    break;
                default:
                    System.out.println("默认逻辑");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
