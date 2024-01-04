package Concurrency;

import java.util.PriorityQueue;

public class ThreadWaitNotifyDemo02 {
    private static final int QUEUE_SIZE = 10;
    private static final PriorityQueue<Integer> queue = new PriorityQueue<>(QUEUE_SIZE);

    public static void main(String[] args) {
        new Producer("producer A").start();
        new Producer("producer B").start();
        new Consumer("consumer A").start();
        new Consumer("Consumer B").start();
    }

    static class Consumer extends Thread {
        Consumer(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == 0) {
                        try {
                            System.out.println("queue is empty, please wait data");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notifyAll();
                        }
                    }
                    queue.poll();
                    queue.notifyAll();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " take a data from the queue, there are " + queue.size() + " datas in this queue");
                }
            }
        }
    }

    static class Producer extends Thread {
        Producer(String name) {
            super(name);
        }

        @Override
        public void run() {
            while(true) {
                synchronized(queue) {
                    while (queue.size() == QUEUE_SIZE) {
                        try {
                            System.out.println("the queue is full, wait for vacant space");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notifyAll();
                        }
                    }
                    queue.offer(1);
                    queue.notifyAll();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " insert a data to the queue, there are " + queue.size() + " datas in this queue");
                }
            }
        }
    }
}
