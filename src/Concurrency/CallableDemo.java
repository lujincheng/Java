package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) {
        Callable<Long> callable = new MyThread();
        FutureTask<Long> future = new FutureTask<>(callable);
        new Thread(future, "Callable thread").start();
        try {
            System.out.println("task takes " + (future.get()) / 1000000 + " miliseconds");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    static class MyThread implements Callable<Long> {
        private int ticket = 10000;

        @Override
        public Long call() {
            long begin = System.nanoTime();
            while (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " sells No " + ticket + " ticket");
                ticket--;
            }

            long end = System.nanoTime();
            return (end - begin);
        }
    }
}
