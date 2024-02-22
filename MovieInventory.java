import java.util.*;
/*
 * MovieInventory.java
 * Zack Rothe
 * Solution to movie inventory lab project thing
 */


 /*
  * psuedocode, which i need to write for some reason
    ask how much lord costs and how many the store owns
    do the same for menace and kids
    print a dollar sign concatanated with the total value
    multiply the # of each movie by the cost, then add them all up and divide by 3
    print that value
  */

public class MovieInventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float lordCost, menaceCost, kidCost;
        int lordNum, menaceNum, kidNum;
        double totalVal;

        System.out.print("How much is lord: ");
        lordCost = scan.nextFloat();
        System.out.print("How many lords does the store own: ");
        lordNum = scan.nextInt();


        System.out.print("How much is menace: ");
        menaceCost = scan.nextFloat();
        System.out.print("How many menaces does the store own: ");
        menaceNum = scan.nextInt();

        System.out.print("How much is kids: ");
        kidCost = scan.nextFloat();
        System.out.print("How many kids does the store own: ");
        kidNum = scan.nextInt();

        totalVal = (float) ((lordCost * lordNum) + (menaceCost * menaceNum) + (kidCost * kidNum));
        System.out.println("Total value of all tapes is $" + totalVal);

        System.out.println("Average value of all tapes is: $" + (totalVal/((lordNum+menaceNum+kidNum))));

    }
}
