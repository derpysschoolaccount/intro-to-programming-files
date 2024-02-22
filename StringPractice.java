import java.util.*;

/*
 * StringPractice.java
 * Zack Rothe
 * Solution to string practice exercise
 */
public class StringPractice
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	    // email or something idk
	    Scanner scan = new Scanner(System.in);
	    String name;
		System.out.print("What's your last name: ");
		name = scan.nextLine();
		System.out.println(name + "@Camelot.com");
		
		// printing strings?
		String person = "King Arthur";
		System.out.println(person);
		
		person = "Guinevere";
		System.out.println(person);
		
		// address thing
		String address, zipCode;
		System.out.print("What\'s your name: ");
		name = scan.nextLine();
		
		System.out.print("What\'s your street address: ");
	    address = scan.nextLine();
	    
	    System.out.print("What\'s your zip code?: ");
	    zipCode = scan.nextLine();
	    
	    System.out.print("Length of city name: " + (address.length() - address.indexOf(",")));
	    
		// father's name?
	    String stringVariable;
	    stringVariable = "Pendragon, Uther";
	    System.out.println(stringVariable.substring(11) + " " + stringVariable.substring(0,9));

		// caption?
		String caption;
		System.out.print("Enter a caption for the image: ");
	    caption = scan.nextLine();

		System.out.println(caption + " has a length of " + caption.length() + ", and the character at the 4th subscript pos is \"" + caption.charAt(4) + "\"");
	}
}
