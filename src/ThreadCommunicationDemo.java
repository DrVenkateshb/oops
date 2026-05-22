// The shared resource that both threads will access
class SharedResource {
    private int item;
    private boolean isAvailable = false; // Flag to track state

    // Method for the Producer to add data
    public synchronized void produce(int item) {
        // If data is already available, wait for consumer to take it
        while (isAvailable) {
            try {
                wait(); // Releases the lock and waits
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.item = item;
        isAvailable = true;
        System.out.println("Produced: " + item);
        notify(); // Wake up the waiting consumer thread
    }

    // Method for the Consumer to retrieve data
    public synchronized int consume() {
        // If no data is available, wait for producer to provide it
        while (!isAvailable) {
            try {
                wait(); // Releases the lock and waits
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isAvailable = false;
        System.out.println("Consumed: " + item);
        notify(); // Wake up the waiting producer thread
        return item;
    }
}

public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer Thread: Produces 5 items
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        // Consumer Thread: Consumes 5 items
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                try { Thread.sleep(800); } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
