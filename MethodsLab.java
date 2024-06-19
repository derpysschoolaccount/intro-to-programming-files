import java.util.Scanner;

public class MethodsLab {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        a();
        a();
        b();
        b();
        System.out.println("They all run after the farmer's wife");


        e();

        System.out.print("Enter average: ");
        int average = scan.nextInt();
        if (average >= 65) {
            f();
        }
        else {
            g();
        }
    }

    public static void a() {
        System.out.println("Three blind mice");
    }

    public static void b() {
        System.out.println("See how they run");
    }

    public static void c() {
        for (int i = 0; i < 30; i++) {
            System.out.print("$");
        }
        System.out.print("\n");
    }
    public static void d() {
        System.out.println("a name");
        System.out.println("an address and a city");
        System.out.println("a state and a zip");
    }
    public static void e() {
        c();
        c();

        d();

        c();
        c();
        c();
    }

    public static void f() {
        System.out.println("passing");
    }

    public static void g() {
        System.out.println("Hook up with a smart classmate and STUDY!");
    }
}