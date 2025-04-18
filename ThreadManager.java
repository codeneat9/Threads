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

