public class ThreadManager {
    // Method to demonstrate both types of threads
    public void runAllThreads() {
        System.out.println("=== Starting Threads ===");

        // Thread using Thread class
        MyThread thread1 = new MyThread("Thread-Class");
        thread1.start();

        // Thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable("Runnable-Interface"));
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("=== All Threads Finished ===");
    }
}
