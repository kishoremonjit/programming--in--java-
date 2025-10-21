package AdvanceJava;

class DelayedCounter implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting with 1 second delay between numbers.");

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " prints number: " + i);

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                // Handle interruption during sleep
                System.out.println(threadName + " was interrupted while sleeping.");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(threadName + " finished sleeping sequence.");
    }
}

 class SleepDemo {
    public static void main(String[] args) {
        Thread delayThread = new Thread(new DelayedCounter(), "SleepyThread");

        System.out.println("Main: Starting the delay thread...");
        delayThread.start();

        try {
            delayThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main: Program finished.");
    }
}

