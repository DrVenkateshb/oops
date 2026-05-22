import java.util.*;

class ArrList {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	Collection<Integer> a = new ArrayList<>();
		Collection<Integer> rem=new ArrayList<>();
      	System.out.println(a);
		a.add(10);
		a.add(5);
		a.add(10);
		a.addAll(a);
		rem.add(5);
		  	System.out.println("The collection after adding Element: "+a);
		a.removeAll(rem);
			System.out.println("The collection after removing 10 Element: "+a);
			System.out.println(a.contains(11));
    }
}