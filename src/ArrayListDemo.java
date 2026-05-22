import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String args[])
    {
        // Create Arraylist
        ArrayList<String> arl = new ArrayList<String>();
        // Add four elements
        arl.add("Venky");
        arl.add("Ravi");
        arl.add("OOPS");
        arl.add("Java");

arl.addAll(arl);
        // display the content
        System.out.println("Content :"+arl);
        ArrayList<String> rem = new ArrayList<String>(); 
        rem.add("Venky");
        arl.removeAll(rem);
System.out.println("after remove all :"+arl);
        Scanner sc=new Scanner(System.in);

        //Display the specific index value in Arraylist

        System.out.println("Enter the Index values to see");
        int ind=sc.nextInt();

        System.out.print("The value at " +ind+ " is :" + arl.get(ind));

    }
}
