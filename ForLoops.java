import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*  1:
        0
        5
        10
        15
        20
        25
        */
        
        /* 2
         * i starts as 0, 0 < 10
         */

        /* 
         * 3
         * 
         * 2
         * 3
         * 4
         * 5
         * 6
         */

         /* 4
          * 
          */

          /*
           * 5
           * 10
           * 9
           * 8
           * 7
           * 6
           * 5
           * 4
           * 3
           * 2
           * 1
           * ready or not here i come
           */


           /*
            * 6
            2
            4
            6
            8
            who do we appreciate java java
            */
          // 7
          int i;
          for (i = 1; i < 8; i++) {
            System.out.println(Math.pow(2,i));
          }

          //8
          int amount;
          System.out.print("Enter the amount of numbers: ");
          amount = scan.nextInt();
          int total, in;
          total = 0;
          for (i = 0; i < amount; i++) {
            System.out.print("Enter a number: ");
            in = scan.nextInt();
            total += in;
          }

          System.out.println("Total: " + total + "\nAverage: " + (total/amount));


          // 9
          String name, type;
          System.out.print("What is the name of your favorite pet: ");
          name = scan.next();
          System.out.print("How many times would you like to see the name appear on the screen: ");
          amount = scan.nextInt();
          System.out.print("Would you like to see the names one per line, or arranged horizontally?");
          type = scan.next();
          if (amount > 0) {
            for (i = 0; i < amount; i++) {
                if (type.equals("horizontal")) {
                    System.out.print(name + " ");
                }
                else {
                    System.out.println(name);
                }
            }
          }

    }
}
