package com.craaaaazy.thread;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
    ExecutorService service = new ThreadPoolExecutor(1, 1, 60 * 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(2), new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r);
        }
    }, new ThreadPoolExecutor.CallerRunsPolicy());

    for (int i = 0; i < 10; i++) {
        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("name " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    }
}
