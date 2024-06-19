import java.util.*;




public class SwitchWorksheet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // tv
        int favorite;
        System.out.println("In this town, there are 5 non-cable TV channels.");
        System.out.print("Which non-cable channel is your favorite(2, 4, 6, 8, 11): ");
        favorite = scan.nextInt();
        switch (favorite) {
            case (2): {
                System.out.println("Channel 2 got top ratings last week!");
                break;
            }

            case (4): {
                System.out.println("Channel 4 primarily shows news!");
                break;
            }

            case (6): {
                System.out.println("Channel 6 shows old movies!");
                break;
            }

            case (8): {
                System.out.println("Channel 8 covers local events!");
                break;
            }

            case (11): {
                System.out.println("Channel 11 is public broadcasting!");
                break;
            }

            default: {
                System.out.println("That channel does not exist. It must be a cable channel.");
                break;
            }
    
        }



        // chart

        int number; // the worksheet doesn't really explain what I'm doing here, so I'll go based on what I think it's asking
        System.out.print("Enter the number:  ");
        number = scan.nextInt();

        switch (number) {
            case (1): {
                System.out.println("Your work is outstanding!");
                break;
            }
            case (2): {
                System.out.println("You are doing great work!");
                break;
            }
            case (3): {
                System.out.println("Your work is satisfactory");
                break;
            }
            case (4): {
                System.out.println("You need to work a little harder");
                break;
            }
            case (5): {
                System.out.println("Please see me for extra help");
                break;
            }
        }


        // number from chart


        System.out.print("Enter a number from 1 to 10, inclusive:  ");
        number = scan.nextInt();

        switch (number) {   
            case (1): {
                System.out.println("Your number is a low odd number.");
                break;
            }

            case (2): {
                System.out.println("Your number is a low even number");
                break;
            }

            case (3): {
                System.out.println("Your number is a low odd number.");
                break;
            }

            case (4): {
                System.out.println("Your number is a low even number");
                break;
            }

            case (5): {
                System.out.println("Your number is the middle odd number.");
                break;
            }
            
            case (6): {
                System.out.println("Your number is the middle even number.");
                break;
            }

            case (7): {
                System.out.println("Your number is a high odd number");
                break;
            }

            case (8): {
                System.out.println("Your number is a high even number.");
                break;
            }

            case (9): {
                System.out.println("Your number is a high odd number");
                break;
            }

            case (10): {
                System.out.println("Your number is a high even number.");
                break;
            }

            default: {
                System.out.println("Invalid number.");
            }

        }



        
    }
}
