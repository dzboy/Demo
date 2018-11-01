package com.craaaaazy.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        ExecutorService service = Executors.newSingleThreadExecutor();
//        Future<Integer> integerFuture = service.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("i = " + i);
//                    Thread.sleep(100);
//                }
//                return 10;
//            }
//        });
//
//        long time = System.currentTimeMillis();
//        Thread.sleep(500);
//        integerFuture.cancel(true);
//        int a = integerFuture.get();
//        System.out.println("re = " + a + " time = " + (System.currentTimeMillis() - time));

//        ExecutorService service = Executors.newSingleThreadExecutor();
//
//        for (int i = 0; i < 10; i++) {
//            Future<Integer> future = service.submit(new Callable<Integer>() {
//                @Override
//                public Integer call() throws Exception {
//                    Thread.sleep(500);
//                    return 10;
//                }
//            });
//        }
//
//        CompletionService<Integer> service1 = new ExecutorCompletionService<Integer>(Executors.newSingleThreadExecutor());
//
//        for (int a = 0; a < 10; a++) {
//            service1.submit(new Callable<Integer>() {
//                @Override
//                public Integer call() throws Exception {
//                    Thread.sleep(500);
//                    return 11;
//                }
//            });
//        }

//        ExecutorService service = Executors.newSingleThreadExecutor();
//
//        final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
//
//        for (int i = 0; i < 10; i++) {
//            final int a = i;
//            final long time = (long) (Math.random() * 10000);
//            System.out.println("------add " + time);
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(time);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    queue.offer(a);
//
//                }
//            }).start();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(queue.take());
//        }
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    int i = 0;
//                    while (true) {
//                        System.out.println(i++);
//                    }
//                } catch (Throwable t) {
//                    t.printStackTrace();
//                }
//                int i = 0;
//                long time = System.currentTimeMillis();
//                while (true) {
//                    if (Thread.currentThread().isInterrupted()) {
//                        System.out.println("=======start break=======");
//                        System.out.println(Thread.interrupted());
//                        System.out.println(Thread.currentThread().isInterrupted());
//                        System.out.println(Thread.interrupted());
//                        System.out.println("break");
//                        System.out.println("=======end break=======");
//                        break;
//                    } else {
//                        try {
//                            Thread.sleep(300);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                            Thread.currentThread().interrupt();
//                            System.out.println(Thread.currentThread().isInterrupted());
//                            break;
//                        }
//                        if ((System.currentTimeMillis() - time) > 1000) {
//                            // 在时长>1s时，打断线程，此时sleep方法执行结束，再次while循环，会进入if判断
//                            Thread.currentThread().interrupt();
//                        }
//                        System.out.println("index " + i++ + " " + Thread.currentThread().isInterrupted());
//                    }
//                }
//            }
//        });
//        thread.start();
//        Thread.sleep(10);
//        thread.interrupt();


//        ExecutorService service = Executors.newSingleThreadExecutor();
//        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                System.out.println("start");
//                Thread.sleep(1000);
//                System.out.println("end");
//                return 10;
//            }
//        });
//        Future<Integer> future = service.submit(task, 1);
//        Thread.sleep(500);
//        task.cancel(true);
//        System.out.println(task.get());
        CompletionService service = new ExecutorCompletionService(Executors.newSingleThreadExecutor());

//        ThreadPoolExecutor.AbortPolicy
//        ThreadPoolExecutor.CallerRunsPolicy
//        ThreadPoolExecutor.DiscardPolicy
//        ThreadPoolExecutor.DiscardOldestPolicy

    }
}
