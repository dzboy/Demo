    package com.craaaaazy.demo016;

    public class ShareApple {
        // 苹果数量
        private int appleNumber = 2;

        public void start() {
            allocation();
            tellMommy();
        }

        public void allocation() {
            System.out.println("开始分苹果");
            if (appleNumber < 1) {
                return;
            }
            System.out.println("给妈妈苹果");
            if (appleNumber < 2) {
                return;
            }
            System.out.println("给爸爸苹果");
        }

        public void tellMommy() {
            System.out.println("跟妈妈说苹果分配情况");
        }

        public static void main(String[] args) {
            ShareApple shareApple = new ShareApple();
            shareApple.start();
        }


    }
