package com.craaaaazy.thread;

import java.util.concurrent.*;

public class TestTimerJoin {
    static class TimedRunner {
    ScheduledExecutorService service = new ScheduledThreadPoolExecutor(1);

    public void runner(Runnable runnable, long time) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        service.schedule(new Runnable() {
            @Override
            public void run() {
                System.err.println("interrupt");
                thread.interrupt();
            }
        }, time, TimeUnit.MILLISECONDS);
        thread.join(time);
    }
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getName());
        TimedRunner runner = new TimedRunner();
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        try {
            runner.runner(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1200);
                        System.out.println("after 1200 " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("before 2200 " + Thread.currentThread().getName());
            Thread.sleep(2200);
            System.out.println("after 2200 " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
