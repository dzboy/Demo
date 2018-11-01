package com.craaaaazy.thread;

public class TestThreadLocal {

    public static void main(String[] args) {
        ThreadLocal<Integer> local = new ThreadLocal<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    local.set(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(local.get() + " " + Thread.currentThread().getName());
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i < 30; i++) {
                    local.set(i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(local.get() + " " + Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
