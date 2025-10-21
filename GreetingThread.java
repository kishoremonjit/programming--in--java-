package AdvanceJava;

class GreetingThread extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started execution.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from iteration " + i + " | Thread Name: " + threadName);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(threadName + " finished execution.");
    }
}

class HelloThread {
    public static void main(String[] args) {
        GreetingThread myThread = new GreetingThread();
        myThread.start();

        System.out.println("Main thread finished launching the new thread.");
    }
}
