import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // what is wrong with the loop
        // a is not incremented

        // 2:
        /*
         a:
         counter: 0
         counter: 1
         counter: 2
         counter: 3
        Loop completed. Counter at 3


        b:
        counter: 0
         counter: 1
         counter: 2
         counter: 3
        Loop completed. Counter at 3


        c:
        counter: 0
        counter: 1
        counter: 2
        Loop completed. Counter at 3

        d:
        counter: 1
        counter: 2
        counter: 3
        Loop completed. Counter at 3
         */


         // 10 - 1

         int i = 0;
         while (i < 10) {
            System.out.println(10-i);
            ++i;
         }

         // odd numbers
         i = 5;
         while (i < 52) {
            System.out.println(i);
            i += 2;
         }

         // name
         String name;
         i = 0;
         System.out.print("Enter your name: ");
         name = scan.next();
         while (i < name.length()) {
            System.out.println((i+1) + ". " + name.charAt(i));
            i++;
         }

    }
}
