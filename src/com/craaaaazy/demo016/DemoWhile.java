package com.craaaaazy.demo016;

public class DemoWhile {
    public static void main(String[] args) {
        int a = 0;
        while (a < 5) {
            System.out.println("a++ 之前 a = " + a + " 条件 a < 5 的结果是 " + (a < 5));
            a++;
            System.out.println("a++ 之后 a = " + a + " 条件 a < 5 的结果是 " + (a < 5));
            System.out.println("---------------------------");
        }
    }
}
