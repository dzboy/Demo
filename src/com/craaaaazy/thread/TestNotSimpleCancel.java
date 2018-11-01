package com.craaaaazy.thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.*;

public class TestNotSimpleCancel {

    abstract static class CallableTask implements Callable {
        private Socket socket;

        public void setSocket(Socket socket) {
            this.socket = socket;
        }

        public void cancel() {
            System.out.println("cancel");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class CancellableTask extends FutureTask {

        CallableTask callable;

        public CancellableTask(CallableTask callable) {
            super(callable);
            this.callable = callable;
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            try {
                callable.cancel();
            } finally {
                return super.cancel(mayInterruptIfRunning);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service =
                new ThreadPoolExecutor(coreCount - 1, coreCount - 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>()) {
                    @Override
                    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
                        if (callable instanceof CallableTask) {
                            return new CancellableTask((CallableTask) callable);
                        } else {
                            return new FutureTask<>(callable);
                        }
                    }
                };

        CallableTask task = new CallableTask() {
            @Override
            public Object call() throws Exception {
                Socket socket = new Socket("172.0.0.1", 8082);
                InputStream inputStream = socket.getInputStream();
                inputStream.read();
                setSocket(socket);
                return null;
            }
        };
        Future future = service.submit(task);
        Thread.sleep(3000);
        future.cancel(true);
    }

}
