    package com.craaaaazy.demo014;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class DemoIfElse {
        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入数字：");

            try {
                String inputString = reader.readLine();
                int i = Integer.valueOf(inputString);

                System.out.println("我输入了：" + i);

                if (i == 0) {
                    System.out.println("我执行了！");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
