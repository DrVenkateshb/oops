class Table {
    static int count = 0; // shared across all objects

    // Instance-level lock — each object has its OWN lock
    static synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            count++; // ⚠ NOT thread-safe across objects!
            System.out.println(n + " x " + i + " = " + (n * i)
                + " [count=" + count + "]");
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}

class WithoutStaticSync {
    public static void main(String[] args) {
        Table object1 = new Table(); // has Lock A
        Table object2 = new Table(); // has Lock B

        // t1 and t2 share Lock A → safe between them
        Thread t1 = new Thread(() -> object1.printTable(2));
        Thread t2 = new Thread(() -> object1.printTable(3));

        // t3 and t4 share Lock B → safe between them
        Thread t3 = new Thread(() -> object2.printTable(4)); // ⚠ runs with t1!
        Thread t4 = new Thread(() -> object2.printTable(5));

        t1.start(); t2.start(); t3.start(); t4.start();
    }
}

/* Possible output (interleaved — race condition!):
   2 x 1 = 2  [count=1]
   4 x 1 = 4  [count=2]   ← t1 and t3 ran together!
   2 x 2 = 4  [count=3]
   4 x 2 = 8  [count=4]   ← counts jumbled
*/