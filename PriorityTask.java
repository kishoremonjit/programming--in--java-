package AdvanceJava;

class PriorityTask implements Runnable {
    private final String taskName;
    private final int iterations = 500;

    public PriorityTask(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(taskName + " starting (Priority: " + currentThread.getPriority() + ")");

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            // Inner loop for a small computation load
            for (int j = 0; j < 10000; j++) {
                double result = Math.sin(Math.random());
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println(taskName + " finished. Duration: " + duration + "ms");
    }
}

class PriorityDemo {
    public static void main(String[] args) {
        // Create three Runnable tasks
        PriorityTask minTask = new PriorityTask("MIN_PRIORITY_Task");
        PriorityTask normTask = new PriorityTask("NORM_PRIORITY_Task");
        PriorityTask maxTask = new PriorityTask("MAX_PRIORITY_Task");

        // Create and configure threads
        Thread minThread = new Thread(minTask);
        Thread normThread = new Thread(normTask);
        Thread maxThread = new Thread(maxTask);

        minThread.setPriority(Thread.MIN_PRIORITY);
        normThread.setPriority(Thread.NORM_PRIORITY);
        maxThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("--- Starting Threads with Different Priorities ---");

        minThread.start();
        normThread.start();
        maxThread.start();
        System.out.println("\nNote: While higher priority threads are favored, the actual execution order \ndepends on the underlying Operating System's thread scheduler.");
    }
}
