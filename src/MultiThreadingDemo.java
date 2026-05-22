// Define the task by implementing Runnable
class MyTask implements Runnable {
    private String taskName;

    public MyTask(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " is executing step " + i + 
                               " on thread: " + Thread.currentThread().getName());
            try {
                // Pause for 1 second to simulate work
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        // 1. Create instances of the task
        MyTask task1 = new MyTask("Task A");
        MyTask task2 = new MyTask("Task B");

        // 2. Create Thread objects and pass the tasks to them
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // 3. Start the threads (calls the run() method internally)
        thread1.start();
        thread2.start();
    }
}
