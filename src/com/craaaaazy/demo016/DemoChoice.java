    package com.craaaaazy.demo016;

    public class DemoChoice {
        public static void main(String[] args) {
            int appleNumber = 2;
            do {
                System.out.println("开始分苹果");
                if (appleNumber < 1) {
                    break;
                }
                System.out.println("给妈妈苹果");
                if (appleNumber < 2) {
                    break;
                }
                System.out.println("给爸爸苹果");
            } while (false);
            System.out.println("跟妈妈说苹果分配情况");

            System.out.println("=============if 的方式实现=============");
            System.out.println("开始分苹果");
            if (appleNumber < 1) {
                System.out.println("跟妈妈说苹果分配情况");
                return;
            }
            System.out.println("给妈妈苹果");
            if (appleNumber < 2) {
                System.out.println("跟妈妈说苹果分配情况");
                return;
            }
            System.out.println("给爸爸苹果");
            System.out.println("跟妈妈说苹果分配情况");
        }
    }
