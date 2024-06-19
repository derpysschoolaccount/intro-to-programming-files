public class MethodsQuiz {
    public static void main(String args[]) {
        int age = 5;
        String name = "Amanda";
        char gender = 'f';
        infoOut(age, name, gender);

        age = 50;
        name = "Regis";
        gender = 'm';
        infoOut(age, name, gender);
    }
    public static void infoOut(int age, String name, char gender) {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}
