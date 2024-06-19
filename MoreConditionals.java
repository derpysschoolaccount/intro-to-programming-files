
/*
 * MoreConditionals.java
 * Zack Rothe
 * solution to more work with conditionals worksheet
 */

import java.util.Scanner;

public class MoreConditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // password
        final String password = "asecurepassword";
        String checkPassword;

        System.out.print("Enter the password: ");
        checkPassword = scan.next();

        if (password.equals(checkPassword)) {
            System.out.println("Hello! You\'re in!");
        }


        // movie

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = scan.next();

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        if (age < 17) {
            System.out.println("Sorry, this movie is rated \"R\". Admission denied " + name);
        }
        else {
            System.out.println("Welcome to the movie!");
        }


        // tv

        int favorite;
        System.out.println("In this town, there are 5 non-cable TV channels.");
        System.out.print("Which non-cable channel is your favorite(2, 4, 6, 8, 11): ");
        favorite = scan.nextInt();

        if (favorite == 2) {
            System.out.println("Channel 2 got top ratings last week!");
        }

        else if (favorite == 4) {
            System.out.println("Channel 4 primarily shows news!");
        }

        else if (favorite == 6) {
            System.out.println("Channel 6 shows old movies!");
        }

        else if (favorite == 8) {
            System.out.println("Channel 8 covers local events!");
        }

        else if (favorite == 11) {
            System.out.println("Channel 11 is public broadcasting!");
        }

        else {
            System.out.println("That channel does not exist. It must be a cable channel.");
        }



        }
    
}
