import java.util.Scanner;
import java.text.*;
/*
 * VacationMileage.java
 * Zack Rothe
 * Solution to vacation mileage mini project
 */

public class VacationMileage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decFor = new DecimalFormat("0.00");
        double inputm, inputg, gallons, miles, week;
        inputm = 0.0;
        inputg = 0.0;
        gallons = 0.0;
        miles = 0.0;
        week = 1.0;
        System.out.print("How many miles have you driven this week(-99 to exit): ");
        inputm = scan.nextDouble();
        while (inputm != -99) {
            System.out.print("How many gallons have you purchased this week: ");
            inputg = scan.nextDouble();
            
            miles += inputm;
            gallons += inputg;
            System.out.println("Week: " + week + "\nMiles: " + decFor.format(inputm) + "\tMiles total: " + decFor.format(miles) + "\nGallons: " + decFor.format(inputg) + "\tGallons total: " + decFor.format(gallons) + "\nMPG: " + (decFor.format(inputm/inputg)) + "\tMPG total: " + decFor.format(miles/gallons));
            week++;
            System.out.print("How many miles have you driven this week(-99 to exit): ");
            inputm = scan.nextDouble();
        }

        System.out.println("\n\nVacation Over!!");
        
    }
}
