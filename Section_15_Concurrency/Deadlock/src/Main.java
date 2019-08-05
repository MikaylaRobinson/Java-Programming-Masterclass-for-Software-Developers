public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    // In this example, two threads are competing for the same locks
    // The project will get stuck (deadlocked), if Thread two is calling
    // the locks in the opposite order as Thread 1. That leaves them waiting
    // on the locks from the opposite thread.
    // This is the fixed code below, where thread 1 uses lock 1, and since
    // it is unavailable, Thread 2 does not begin its task until
    // Thread 1 releases the lock
    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Has lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 1: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1:  has lock1 and lock 2");
                }
                System.out.println("Thread 1: released lock2");
            }
            System.out.println("Thread 1: Released lock1: Exiting...");
        }
    }
    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 2: has lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 2: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 2: has lock1 and lock2");
                }
                System.out.println("Thread 2: released lock2");
            }
            System.out.println("Thread 2: released lock1. Exiting....");
        }
    }
}