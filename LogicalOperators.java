import java.util.Scanner;


/*
 * LogicalOperators.java
 * Zack Rothe
 * solution to logical operators worksheet
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int len1, len2, len3;
        Scanner scan = new Scanner(System.in);


        // triangles
        System.out.print("Enter the length of side 1: ");
        len1 = scan.nextInt();

        System.out.print("Enter the length of side 2: ");
        len2 = scan.nextInt();

        System.out.print("Enter the length of side 3: ");
        len3 = scan.nextInt();

        if ((len1 == len2) && (len2 == len3)) {
            System.out.println("Equilateral.");
        }
        else if ((len1 == len2) || (len2 == len3) || (len1 == len3)) {
            System.out.println("Isosceles.");
        }
        else {
            System.out.println("Scalene");
        }


        // money
        System.out.print("Enter an integer between 50 and 100: ");
        int response = scan.nextInt();
        if ((response > 50) && (response < 100)) {
            System.out.println("You won $" + response);
        }
        else {
            System.out.println("Sorry, not following directions will cost you dearly :-(");
        }


        // virus
        System.out.print("This program may contain a virus. Do you wish to continue (y/n): ");
        String proceed = scan.next();

        if (proceed.equalsIgnoreCase("y")) {
            System.out.println("You are a gambler!");
        }
        else if (proceed.equalsIgnoreCase("n")) {
            System.out.println("Smart choice!");
        }
        else {
            System.out.println("That was not a y or n. Do you hear coughing?");
        }



        // honor roll
        double average;
        int courses, infractions;

        System.out.print("What is your average grade: ");
        average = scan.nextDouble();

        System.out.print("How many courses are you taking: ");
        courses = scan.nextInt();

        System.out.print("How many infractions do you have: ");
        infractions = scan.nextInt();

        if ((average > 90) && (courses >= 5) && (infractions == 0)) {
            System.out.println("You are eligible for the honor roll.");
        }
        else {
            System.out.println("You are not eligible for the honor roll.");
        }
    }
}
