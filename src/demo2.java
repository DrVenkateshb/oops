public class demo2 extends Thread
{
    public void run()
    {
System.out.println("Inside run method");
for(int i=1;i<10;i++)
{
    System.out.print(i);

}
    }
    public static void main(String[] args) {
        demo2 d=new demo2();
        d.start();
    }
    
}
