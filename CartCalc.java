import java.util.Scanner;
import java.text.*;
/*
 * CartCalc.java
 * Zack Rothe
 * Solution to test
 */

public class CartCalc {
    public static void main(String[] args) {
        String item1, item2, item3, item4, item5; // names
        int q1, q2, q3, q4, q5; // quantities
        double c1, c2, c3, c4, c5; // costs
        Scanner scan = new Scanner(System.in); // scanner for later
        // item 1
        System.out.print("Enter the name of item 1: ");
        item1 = scan.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        q1 = scan.nextInt();
        System.out.print("Enter the cost of item 1: ");
        c1 = scan.nextDouble();
        // item 2
        System.out.print("Enter the name of item 2: ");
        item2 = scan.next();
        System.out.print("Enter the quantity of item 2: ");
        q2 = scan.nextInt();
        System.out.print("Enter the cost of item 2: ");
        c2 = scan.nextDouble();
        // item 3
        System.out.print("Enter the name of item 3: ");
        item3 = scan.next();
        System.out.print("Enter the quantity of item 3: ");
        q3 = scan.nextInt();
        System.out.print("Enter the cost of item 3: ");
        c3 = scan.nextDouble();
        // item 4
        System.out.print("Enter the name of item 4: ");
        item4 = scan.next();
        System.out.print("Enter the quantity of item 4: ");
        q4 = scan.nextInt();
        System.out.print("Enter the cost of item 4: ");
        c4 = scan.nextDouble();
        // item 5
        System.out.print("Enter the name of item 5: ");
        item5 = scan.next();
        System.out.print("Enter the quantity of item 5: ");
        q5 = scan.nextInt();
        System.out.print("Enter the cost of item 5: ");
        c5 = scan.nextDouble();

        
        DecimalFormat f = new DecimalFormat("0.00"); // for later use
        System.out.println("Item 1\tItem 2\t Item 3\t Item 4\t Item 5"); // header
        System.out.println("Name: " + item1 + "\t" + "Name: " + item2 + "\t" + "Name: " + item3 + "\t" + "Name: " + item4 + "\t" + "Name: " + item5); // names
        System.out.println("Quantity: " + q1 + "\t" + "Quantity: " + q2 + "\t" + "Quantity: " + q3 + "\t" + "Quantity: " + q4 + "\t" + "Quantity: " + q5); // quantities
        System.out.println("Price: $" + f.format(c1) + "\t" + "Price: $" + f.format(c2) + "\t" + "Price: $" + f.format(c3) + "\t" + "Price: $" + f.format(c4) + "\t" + "Price: $" + f.format(c5)); // prices
        System.out.println("Total: $" + f.format(q1*c1) + "\t" + "Total: $" + f.format(q2*c2) + "\t" + "Total: $" + f.format(q3*c3) + "\t" + "Total: $" + f.format(q4*c4) + "\t" + "Total: $" + f.format(q5*c5)); // a bunch of totals
        double totalCost = q1*c1 + q2*c2 + q3*c3 + q4*c4 + q5*c5; // this is used multiple times
        String fCost = f.format(totalCost); // formatted for later
        System.out.println("Total cost of all items\t$"  + fCost); // subtotal
        System.out.println("Tax is .0765\t$" + f.format(totalCost*0.0765)); // print tax amount
        System.out.println("Total plus tax\t$" + f.format(totalCost + (totalCost*0.0765))); // total price
    }
}
