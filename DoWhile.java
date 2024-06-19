import java.util.Scanner;
/*
 * DoWhile.java
 * Zack Rothe
 * Solution to do while worksheet
 */

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * 1:
         * T-minus 5
         * T-minus 4
         * T-minus 3
         * T-minus 2
         * T-minus 1
         * Zero
         * Blast off!
         */

         /*
          * 2:
          int z = 4;
          int sum = 0;
          do {
            sum += z;
            System.out.println(sum);
            z++;
          }
          while (z <= 8);
          */

          /*
           * 3:
           * Loop completed. Counter at 5
           * Sum at 15
           */


        // 4

        int i = 0;
        do {
            i += 2;
            System.out.println(i);
        }
        while (i < 40);


        // 5
        int cnum = 1 + ((int) (Math.random()*100.00));
        int unum = -99;
        int tries = 0;
        do {
            ++tries;
            System.out.print("Enter a number: ");
            unum = scan.nextInt();
            if (unum < 1 || unum > 100) {
                System.out.println("Number was invalid.");
            }
            else {
                if (unum < cnum) {
                    System.out.println("Cnum is bigger than that.");
                }
                else if (unum > cnum) {
                    System.out.println("Cnum is less than that.");
                }
            }
        }
        while (unum != cnum);
        System.out.println("Guessed in " + tries + " guesses.");
    }
}
