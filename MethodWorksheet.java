/*
 * 
 * 1:
 * Here i am in main().
 * Inside the first method, I am!
 * Inside the second method, I am!
 * Back home to main().
 * 
 * 2: Main. Before swap, x: 5 and y: 10
 * Swap. Before swap, x: 5 and y: 10
 * Swap. After swap, x: 10 and y: 5
 * Main. After swap, x: 5 and y: 10
 * 
 * 3:
 * Enter a character:
 * Enter an integer
 * ccccc
 * Enter another character or press q to quit:
 * Enter an integer
 * cccccccccccccccccccc
 * The value of times is 20.
 * Bye
 */

public class MethodWorksheet {
    public static void main(String args[]) {
        heading();

        sqrandadd(5, 185714912); // this will overflow but i don't really care

        aaaa('e', 15, 4);
    }

    public static void heading() {
        System.out.println("company name or something");
    }

    public static void sqrandadd(int a, int b) {
        System.out.println((a * a) + (b * b));
    }

    public static void aaaa(char a, int b, int c) {
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
            System.out.print("\n");
        }
    }
}
