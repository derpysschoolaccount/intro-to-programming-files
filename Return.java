public class Return {
    public static void main(String args[]) {
        String idk = somestring();
        int four = pow(2, 2);
        System.out.println(idk);
        System.out.println(four);
    }

    public static String somestring() {
        String text = "";
        for (int i = 0; i < 10; i++) {
            text = text + "aaaa";
        }
        return text;
    }

    public static int pow(int a, int b) {
        int out = 1;
        for (int i = 0; i < b; i++) {
            out *= a;
        }
        return out;
    }
}
