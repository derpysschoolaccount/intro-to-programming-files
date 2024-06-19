import java.util.Scanner;


/*
 * Calculator.java
 * Zack Rothe
 * Solution to calculator test
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operator; // initialise variables
        double num1, num2, output;

        System.out.println("Welcome to basic calculator");

        System.out.print("Enter first number: ");
        num1 = scan.nextDouble(); // get numbers

        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();

        System.out.print("Enter the operator: ");
        operator = scan.next(); // get operator
        output = 0.0; // set the variable to a number in case the user's input is invalid
        switch (operator) { // find which operator it is
            case ("+"): {
                output = num1 + num2;
                break;
            }
            case ("-"): {
                output = num1 - num2;
                break;
            }
            case ("*"): {
                output = num1 * num2;
                break;
            }
            case ("/"): {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0.");
                    break;
                }
                output = num1 / num2;
                break;
            }
        }
        if (! ((operator.equals("/")) && (num2 == 0))) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + output);
        } // display output
    }
}
