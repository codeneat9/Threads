# Java Threads

## 👨‍💻 Developed By
- **Name:** Yashwith Behara  
- **PRN:** 23070126151 
- **Batch:** AIML B3

---

## 📚 Project Description

This Java project demonstrates the working of **Threads** in Java through two approaches:
1. Extending the `Thread` class
2. Implementing the `Runnable` interface

Each operation has been implemented in a separate Java class as per OOP principles.

---

## 📂 File Structure

| File Name           | Description |
|---------------------|-------------|
| `Main.java`         | Contains the main method. Calls the `ThreadManager` to run all thread-based operations. |
| `ThreadManager.java`| Manages and executes threads created from both `Thread` and `Runnable`. |
| `MyThread.java`     | Implements a thread by extending the `Thread` class. |
| `MyRunnable.java`   | Implements a thread using the `Runnable` interface. |
| `README.md`         | Project documentation. |

---

## ⚙️ Functionality Description

### 🔹 `Main.java`
- Acts as the entry point of the program.
- Calls the `runAllThreads()` method from `ThreadManager`.

### 🔹 `ThreadManager.java`
- Contains the logic to start and run both types of threads:
  - One that extends `Thread`
  - One that implements `Runnable`
- Ensures both threads complete execution using `.join()`.

### 🔹 `MyThread.java`
- Custom thread that prints a count from 1 to 5.
- Demonstrates thread behavior by sleeping for 0.5 seconds between prints.

### 🔹 `MyRunnable.java`
- Custom thread using `Runnable`.
- Also prints a count from 1 to 5 but with a delay of 0.7 seconds.

---
## 🧪 Sample Output
=== Starting Threads ===
Thread-Class - Count: 1
Runnable-Interface - Count: 1
Thread-Class - Count: 2
Runnable-Interface - Count: 2
Thread-Class - Count: 3
...
=== All Threads Finished ===

---

