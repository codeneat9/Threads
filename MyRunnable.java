public class MyRunnable implements Runnable {
    private String taskName;

    public MyRunnable(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        // Display current thread activity
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(700); // pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
    }
}
