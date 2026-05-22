import java.util.*;

// Step 1: Custom Exception Class (same file)
class LowAttendanceException extends Exception {
    LowAttendanceException(String message) {
        super(message);
    }
}

// Step 2: Main Class
public class UserDefinedExceptionDemo {

    static void checkAttendance(int attendance) 
            throws LowAttendanceException {

        if(attendance < 75) {
            throw new LowAttendanceException(
                "Attendance below 75%! Not eligible for exam."
            );
        } else {
            System.out.println("Eligible for Exam");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter attendance percentage: ");
            int att = sc.nextInt();

            checkAttendance(att);

        } catch (LowAttendanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }

        sc.close();
    }
}