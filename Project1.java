import java.util.Scanner;
/*
 * Project1.java
 * Zack Rothe
 * Solution to project 1
 */
public class Project1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int currentin, min, max;
        double total, i;
        total = 0.0;
        min = 999999;
        max = -99999;

        for (i = 0.0; i < 5; i += 1.0) {
            System.out.print("Enter a whole number: ");
            currentin = scan.nextInt();
            total += currentin;
            if (currentin < min) { min = currentin; }
            if (currentin > max) { max = currentin; }

            System.out.println("************************");
            System.out.println("Entry: " + (i+1));
            System.out.println("Total: " + total);
            System.out.println("Average: " + (total/(i+1)));
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);

            
        }
    }
}
