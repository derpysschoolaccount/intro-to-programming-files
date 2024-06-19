import java.util.Scanner;

public class Rainbow {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);


        System.out.print("How many gallons of red paint: ");
        int amountr = scan.nextInt();
        System.out.print("How many gallons of green paint: ");
        int amountg = scan.nextInt();

        double c = total(costr(amountr), costg(amountg));
        name();
        System.out.println("Red total: $" + costr(amountr));
        System.out.println("Green total: $" + costg(amountg));
        System.out.println("Total: $" + c);
        e();


        
    }

    public static double costr(int amount) {
        return 21.95 * amount;
    }

    public static double costg(int amount) {
        return 19.95 * amount;
    }

    
    public static void name () {
        System.out.println("rainbow paint store or something idk");
    }

    public static double total (double a, double b) {
        return (a + b) * 1.08;
    }

    public static void e () {
        System.out.println("thank you for shopping here");
    }
}
