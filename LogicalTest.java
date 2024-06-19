import java.util.Scanner;


/*
 * LogicalTest.java
 * Zack Rothe
 * Solution to grade checker test
 */



public class LogicalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int grade1, grade2, grade3;

        System.out.print("Enter your first grade: ");
        grade1 = scan.nextInt();

        System.out.print("Enter your second grade: ");
        grade2 = scan.nextInt();

        System.out.print("Enter your third grade: ");
        grade3 = scan.nextInt();


        if (grade1 > 60 && grade2 > 60 && grade3 > 60) {
            System.out.println("Congratulations! You have passed");
        }
        else {
            System.out.println("You failed.");
        }
    }
}
