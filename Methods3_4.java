import java.util.Scanner;

public class Methods3_4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("number: ");
        int input = scan.nextInt();
        System.out.println(a(input));

        System.out.println(b(5,12));
        System.out.println(d(c(5)));
    }

    public static int a(int num) {
        return num*2;

    }

    public static int b(int a, int b) {
        return (-a - b)/-2;
    }

    public static int c(int num) {
        return num * num;
    }

    public static int d(int num) {
        return num * num * num;
    }
}
