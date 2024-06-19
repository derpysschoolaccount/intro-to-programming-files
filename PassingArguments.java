public class PassingArguments {
    public static void main(String args[]) {
		
		intro();
		message("dwafegtg", 5, 4, 'A');
		message("ergty6", 0, 0, 'U');
        message("14fhbfuyrn", 2, 3, 'C');
	}
	
	public static void intro() {
		System.out.println("9-10 points is an A");
		System.out.println("7-8 points is a B");
		System.out.println("5-6 points is a C");
		System.out.println("3-4 points is a D");
		System.out.println("0-2 points is a U\n");
	}
	
	public static void message(String name, int num1, int num2, char grade) {
		System.out.println("How are you?");
		System.out.println("My name is " + name);
		System.out.println("Total points are " + sum(num1, num2));
		System.out.println("My grade is a(n) " + grade + "\n");
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

}
