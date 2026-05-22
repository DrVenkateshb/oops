class VIT extends Thread
{
public void run() 
{
for( int i=1; i<=3; i++) 
    { System.out.println("VIT"); try {
    Thread.sleep(1000);
} 
catch (Exception e) {}
    }}}
class AP extends Thread
{
public void run() 
{
for( int i=1; i<=3; i++) 
    { 
        System.out.println("AP");
try {
    Thread.sleep(1000);
} 
catch (Exception e) {}
}}}

public class demo1{
public static void main(String args[]) 
{ 
    VIT obj1 = new VIT();
    AP obj2 = new AP();
    obj1.start();
    obj2.start();
}
}
