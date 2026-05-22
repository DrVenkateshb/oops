import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // ----- ArithmeticException -----
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   // may cause divide by zero
            System.out.println("Result = " + result);

            // ----- ArrayIndexOutOfBoundsException -----
            int arr[] = {10, 20, 30, 40};

            System.out.print("Enter array index (0-3): ");
            int index = sc.nextInt();

            System.out.println("Value = " + arr[index]);

        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
        finally {
            System.out.println("Program executed successfully.");
        }

        sc.close();
    }
}