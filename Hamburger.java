import java.util.Scanner;

/*
 * Hamburger.java
 * Zack Rothe
 * Solution to Hamburger Helper final
 */

public class Hamburger {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double weight = 0.25, pounds = 0.0;

        System.out.print("How many hamburgers are you going to make(0 to use weight): ");
        double amount = scan.nextDouble();

        if (amount <= 0.0) {
            System.out.print("How many pounds do you have: ");
            pounds = scan.nextDouble();
            
            System.out.println("You can make " + b(pounds, weight) + " burgers with " + pounds + " pounds of hamburger.");
        }
        else {
            System.out.println("You need " + a(amount, weight) + " pounds of hamburger to make " + amount + " burgers.");
        }
    }

    public static double a(double a, double b) {
        return a * b;
    }

    public static double b(double a, double b) {
        return a / b;
    }
}
