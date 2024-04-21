import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number (A): ");
        int A = scanner.nextInt();

        System.out.println("Enter a second number (B): ");
        int B = scanner.nextInt();



        // להדפיס את המספרים על המסך לפני ההחלפה
        System.out.println("The Numbers before swapping: A = " + A + ", B = " + B);

        // להחליף את התוכן של המספרים
        int temp = A;
        A = B;
        B = temp;

        // להדפיס את המספרים אחרי ההחלפה
        System.out.println("After swapping: A = " + A + ", B = " + B);


    }
}