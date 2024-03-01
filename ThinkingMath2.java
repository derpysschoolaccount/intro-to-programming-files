import java.util.*;

public class ThinkingMath2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // two digit number printer thing
        String twoDigitNumber;
        System.out.print("Enter a two digit number: ");
        twoDigitNumber = scan.next();

        System.out.println("First digit: " + twoDigitNumber.charAt(0));
        System.out.println("Second digit: " + twoDigitNumber.charAt(1));

    }
}
