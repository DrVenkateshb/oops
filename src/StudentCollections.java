import java.util.*;

public class StudentCollections {
    public static void main(String[] args) {

        // Step 1: Create an ArrayList to store student marks
        Collection<Integer> marks = new ArrayList<>();
System.out.println("The elements in the marks list: "+ marks);
        // Step 2: Add elements to the ArrayList
        marks.add(85);
        System.out.println("The elements in the marks list: "+ marks);

        marks.add(72);
        System.out.println("The elements in the marks list: "+ marks);
        marks.add(90);
        System.out.println("The elements in the marks list: "+ marks);
        marks.add(66);
        System.out.println("The elements in the marks list: "+ marks);
        marks.add(78);
        System.out.println("The elements in the marks list: "+ marks);
        marks.add(100);
        System.out.println("The elements in the marks list: "+ marks);
        marks.remove(66);
          System.out.println("The elements in the marks list: "+ marks);
            System.out.println("No of elements in the list "+ marks.size());
    }
}