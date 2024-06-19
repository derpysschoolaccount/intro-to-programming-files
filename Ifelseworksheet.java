import java.util.Scanner;

public class Ifelseworksheet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // age problem
        System.out.print("How old are you: ");
        int age = scan.nextInt();
        System.out.print("What\'s your name: ");
        String name = scan.next();

        if (age > 16) {
            System.out.println("It\'s scary, " + name + "... you are old enough to drive");
        }


        // odd/even problem 
        int number;
        System.out.print("Enter a positive integer: ");
        number = scan.nextInt();
        if ((number % 2) == 1) {
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even.");
        }


        // telegram problem
        int words;
        double cost = 8.5;

        System.out.print("How many words are in the telegram: ");
        words = scan.nextInt();

        if (words > 15) {
            cost +=  (words-15)*.25;
        }
        System.out.println("Cost: " + cost);


        // sorting problem
        int num1, num2;
        System.out.print("Enter a number: ");
        num1 = scan.nextInt();

        System.out.print("Enter another number: ");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + ", " + num2);
        }
        else if (num1 < num2) {
            System.out.println(num2 + ", " + num1);
        }
        else {
            System.out.println("They are equal.");
        }


        // age problem
        int age2;
        System.out.print("How old are you: ");
        age2 = scan.nextInt();

        if (age2 < 5) {
            System.out.println("Entry is free.");
        }
        else if (age2 >= 65) {
            System.out.println("Cost is $1.50.");
        }
        else {
            System.out.println("Cost is $2.50.");
        }



        // misc problem
        int year;
        System.out.print("Enter your birth year: ");
        year = scan.nextInt();

        if (year < 1970) {
            System.out.println("You qualify for the Juke Box Rally");
        }

        String fruit;
        System.out.print("What\'s your favorite fruit: ");
        fruit = scan.next();
        if (fruit.equalsIgnoreCase("strawberry")) {
            System.out.println("Strawberry Fields Forever");
        }
        else {
            System.out.println("Bye, bye Miss American Pie");
        }


    }
}
