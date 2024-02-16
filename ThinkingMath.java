import java.util.*;
import java.lang.Math;
/*
 * ThinkingMath.java
 * Zack Rothe
 * Solution to thinking math worksheet
 */

public class ThinkingMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPlayers;
        //volleyball thing
        System.out.print("How many players are there: ");
        numPlayers = scan.nextInt();

        System.out.println("There will be " + (int )Math.floor((double) numPlayers/7) + " team(s) with " + numPlayers%7 + " players left over.");

        // two digit number printer thing
        String twoDigitNumber;
        System.out.print("Enter a two digit number: ");
        twoDigitNumber = scan.next();

        System.out.println("First digit: " + twoDigitNumber.charAt(0));
        System.out.println("Second digit: " + twoDigitNumber.charAt(1));

        // three digit number printer adder thing
        String threeDigitNumber;
        System.out.print("Enter a three digit number: ");
        threeDigitNumber = scan.next();

        System.out.println("First digit: " + threeDigitNumber.charAt(0));
        System.out.println("Second digit: " + threeDigitNumber.charAt(1));
        System.out.println("Third digit: " + threeDigitNumber.charAt(2));

        int sumDigits = Integer.parseInt("" + threeDigitNumber.charAt(0)) + Integer.parseInt("" + threeDigitNumber.charAt(1)) + Integer.parseInt("" + threeDigitNumber.charAt(2));
        System.out.println("Sum of digits: " + sumDigits);
    }
}
