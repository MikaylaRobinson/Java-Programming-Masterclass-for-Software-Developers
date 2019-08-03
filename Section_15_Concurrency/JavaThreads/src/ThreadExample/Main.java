package ThreadExample;

import static ThreadExample.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        // This is an output from the main thread
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        // Within the original thread, we run AnotherThread
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        // When running the main thread, it will also run this thread
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        // Thread from MyRunnable Class
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
            });

        myRunnableThread.start();

        // This is another output from this main thread
        System.out.println(ANSI_PURPLE + "Hello again from main thread");
    }
}
