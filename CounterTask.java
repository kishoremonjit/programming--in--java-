package AdvanceJava;

class CounterTask implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started counting.");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i + " by " + threadName);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(threadName + " finished counting.");
    }
}

class RunnableCounter {
    public static void main(String[] args) {
        CounterTask task = new CounterTask();
        Thread myThread = new Thread(task, "NumberPrinterThread");

        myThread.start();

        System.out.println("Main thread continues its work.");
    }
}