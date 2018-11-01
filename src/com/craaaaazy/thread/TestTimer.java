    package com.craaaaazy.thread;

    import java.util.concurrent.ScheduledExecutorService;
    import java.util.concurrent.ScheduledFuture;
    import java.util.concurrent.ScheduledThreadPoolExecutor;
    import java.util.concurrent.TimeUnit;

    public class TestTimer {
        static class TimedRunner {
            ScheduledExecutorService service = new ScheduledThreadPoolExecutor(1);
            public void timedRunner(Runnable runnable, long time) {
                Thread thread = Thread.currentThread();
                ScheduledFuture future = service.schedule(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("will interrupt " + thread.getName());
                        thread.interrupt();
                    }
                }, time, TimeUnit.MILLISECONDS);
                runnable.run();
                future.cancel(true);
            }
        }
        public static void main(String[] args) {
            new TimedRunner().timedRunner(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("after " + Thread.currentThread().getName());
                }
            }, 1000);

            try {
                System.out.println("before sleep 1200 " + Thread.currentThread().getName());
                Thread.sleep(1200);
                System.out.println("after sleep 1200 " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
