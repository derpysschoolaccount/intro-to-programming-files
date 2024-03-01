import java.util.Scanner;

public class ThinkingMath3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
