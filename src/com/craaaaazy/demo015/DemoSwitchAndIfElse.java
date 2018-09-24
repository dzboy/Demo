    package com.craaaaazy.demo015;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class DemoSwitchAndIfElse {
        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入数字：");

            try {
                String inputString = reader.readLine();
                int i = Integer.valueOf(inputString);

                if (i >= 1 && i <= 3) {
                    System.out.println(i + " * 10 = " + (i * 10));
                } else if (i >= 4 && i <= 6) {
                    System.out.println(i + " * 20 = " + (i * 10));
                } else {
                    System.out.println("默认逻辑");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
