package com.craaaaazy.thread;

import java.util.concurrent.*;

public class TestTimerFuture {

    static class TimerRunner {
        ExecutorService service = Executors.newSingleThreadExecutor();
    public void runner(Runnable runnable, long time) throws InterruptedException {
        Future<?> future = service.submit(runnable);
        try {
            future.get(time, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("TimeoutException");
            e.printStackTrace();
        } finally {
            future.cancel(true);
        }
    }
    }

    public static void main(String[] args) {
        TimerRunner runner = new TimerRunner();
        try {
            runner.runner(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("300 1");
                        Thread.sleep(1200);
                        System.out.println("300 2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("InterruptedException " + Thread.currentThread().isInterrupted());
            Thread.currentThread().interrupt();
            System.out.println("InterruptedException " + Thread.currentThread().isInterrupted());
        }

        System.out.println("2200 1");
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2200 2");
    }
}
