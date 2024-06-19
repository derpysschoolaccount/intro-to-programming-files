import java.util.Scanner;
import java.text.*;


/*
 * Coins.java
 * Zack Rothe
 * Solution to coins thing
 */


public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decFor = new DecimalFormat("0.00");
        int i;
        double sum, numflips;
        String input;
        sum = 0.0;
        System.out.print("Enter # of flips: ");
        numflips = scan.nextDouble();
        for (i = 0; i < numflips; i++) {
            System.out.print("Enter result as H or T #" + (i+1) + ": ");
            input = scan.next();
            if (input.equalsIgnoreCase("h")) {
                sum += 1.0;
            }

        }

        System.out.println("Results:");
        System.out.println(((int) sum) + " heads, or " + decFor.format((sum/numflips) * 100) + "%");
        System.out.println(((int) (numflips-sum)) + " tails, or " + decFor.format(((numflips - sum) / numflips) * 100) + "%");
    }
}
