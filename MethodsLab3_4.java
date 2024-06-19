import java.text.*;
import java.util.Scanner;

public class MethodsLab3_4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("what's your favorite word: ");
        String word = scan.next();
        System.out.print("what's your favorite number: ");
        int num = scan.nextInt();
        a(word, num);

        System.out.print("number a: ");
        int a = scan.nextInt();

        System.out.print("number b: ");
        int b = scan.nextInt();

        b(a, b);
        c(a, b);

        System.out.print("what's your name: ");
        String name = scan.next();
        d(name);
        System.out.println("goodbye " + name);

        System.out.print("how many days late is the book: ");
        int days = scan.nextInt();
        e(days);

        System.out.print("number: ");
        num = scan.nextInt();
        System.out.println(f(num));

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " " + g(i));
        }
    }

    public static void a(String word, int e) {
        for (int i = 0; i < e; i++) {
            System.out.println(word);
        }
    }

    public static void b(int a, int b) {
        System.out.println(a + b);
    }

    public static void c(int a, int b) {
        System.out.println(a * b);
    }

    public static void d(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void e(int days) {
        int e = days * 15;
        System.out.println("cost is " + e + " cents");

        if (days > 10) {
            System.out.println("WAY OVERDUE");
        }
    }

    public static int f(int num) {
        int t = 0;
        for (int i = 1; i < (num+1); i++) {
            t += i;
        }
        return t;
    }

    public static String g(int r) {
        DecimalFormat decfor = new DecimalFormat("0.0");
        return decfor.format(3.14159 * (r * r));
    }
}


