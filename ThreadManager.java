public class ThreadManager {
    // Method to demonstrate both types of threads
    public void runAllThreads() {
        System.out.println("=== Starting Threads ===");

        // Thread using Thread class
        MyThread thread1 = new MyThread("Thread-Class");
        thread1.start();

