package AdvanceJava;

public class ThreadInfo {
    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();

        System.out.println("--- Current Thread Information ---");

        System.out.println("Thread Name: " + currentThread.getName());

        System.out.println("Thread Priority: " + currentThread.getPriority());


        System.out.println("Thread State: " + currentThread.getState());

        System.out.println("Thread ID: " + currentThread.getId());

        System.out.println("----------------------------------");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "DemonstrationThread");

        System.out.println("State before start(): " + t2.getState());
        t2.start();
    }
}
