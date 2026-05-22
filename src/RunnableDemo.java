// Step 1: Create class implementing Runnable
class NumberThread implements Runnable {

    // Step 2: Override run() method
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Number Thread: " + i);
            try {
                Thread.sleep(500); // pause for visibility
            } catch(Exception e) {}
        }
    }
}

class AlphabetThread implements Runnable {

    public void run() {
        for(char ch='A'; ch<='E'; ch++) {
            System.out.println("Alphabet Thread: " + ch);
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}

// Main class
public class RunnableDemo {
    public static void main(String[] args) {

        // Step 3: Create Runnable objects
        NumberThread nt = new NumberThread();
        AlphabetThread at = new AlphabetThread();

        // Step 4: Create Thread objects
        Thread t1 = new Thread(nt);
        Thread t2 = new Thread(at);

        // Step 5: Start threads
        t1.start();
        t2.start();
    }
}