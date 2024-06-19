public class ReturnProject {
    public static void main(String args[]) {
        String first = "Babe";
        String last = "Ruth";
        char middle = 'T';
        int origAge = 65;
        setUp(first, last, middle, origAge);
        first = "Clyde";
        last = "Salyards";
        middle = 'P';
        origAge = 50;
        setUp(first, last, middle, origAge);
        first = "Zack";
        last = "Rothe";
        middle = 'E';
        origAge = 15;
        setUp(first, last, middle, origAge);
    }

    public static void setUp(String fir, String las, char mid, int ag) {
        String entire = combine(fir, mid, las);
        int newAge = addTen(ag);
        display(entire, newAge);
    }

   public static String combine(String f, char m, String l) {
        String whole = f + " " + m + " " + l;
        return whole;
   }

   public static int addTen(int a) {
    return a + 10;
   }

   public static void display(String e, int n) {
    System.out.println(e);
    System.out.println(n);
   }
}

/*
 output:
Babe T Ruth
75
Clyde P Salyards
60
Zack E Rothe
25
 */