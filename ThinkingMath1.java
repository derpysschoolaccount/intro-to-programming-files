import java.util.*;
import java.lang.Math;
/*
 * ThinkingMath.java
 * Zack Rothe
 * Solution to thinking math worksheet
 */

public class ThinkingMath1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPlayers;
        //volleyball thing
        System.out.print("How many players are there: ");
        numPlayers = scan.nextInt();

        System.out.println("There will be " + (int )Math.floor((double) numPlayers/7) + " team(s) with " + numPlayers%7 + " players left over.");

    }
}
