import java.util.*;
import java.lang.Math;

/*
 * DataBasics.java
 * Zack Rothe
 * Solution to data basics exercise
 */

public class DataBasics {
    public static void main(String args[]) {
        int year, height, weight, milesDriven, gallonsPurchased, bond;
        String name, favColor;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What year is it: ");
        year = scan.nextInt();
        System.out.println(year/20 + " score and " + (year % 20) + " years ago");
        
        System.out.print("How tall are you in inches: ");
        height = scan.nextInt();
        System.out.println("You are " + Math.floor(height / 12) + " ft. " + (height % 12) + " inches tall");
        
        System.out.print("How much do you think the thing weighs in pounds: ");
        weight = scan.nextInt();
        System.out.println("Weight in ounces: " + weight*16);
        
        System.out.print("How far do you drive: ");
        milesDriven = scan.nextInt();
        
        System.out.print("How much gas do you buy:");
        gallonsPurchased = scan.nextInt();
        
        System.out.println("Mileage: " + (double) milesDriven / gallonsPurchased + " miles per gallon");
        
        bond = 007;
        System.out.println("10x: " + bond * 10 + " cubed: " + bond * bond * bond + " bond: " + bond);
        

        System.out.print("What\'s your name: ");
        name = scan.next();
        
        System.out.print("What\'s your favorite color: ");
        favColor = scan.next();
        
        System.out.println(name + ", did you ever think of dying your hair " + favColor);
    }
}