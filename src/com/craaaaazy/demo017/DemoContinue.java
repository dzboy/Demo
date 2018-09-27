    package com.craaaaazy.demo017;

    public class DemoContinue {
        public static void main(String[] args) {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.println("可以被2整除的数字：" + i);
            }
        }
    }
