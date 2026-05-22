public class Car extends Thread
{ 
    public String name;
public Car(String carname)
{
this.name = carname;
}
public void run()	
{ 
    if(name =="Audi")
System.out.println("Fast and Smooth Driving");
else
System.out.println("Smooth Driving");
}
public static void main(String[] args) {
Thread car1 = new Car("Audi"); 
Thread car2 = new Car("Maruthi"); 
car1.start();
car2.start();
} 
}
