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
		String address, cityname;
		
		System.out.print("What\'s your city, state and zip code: ");
	    address = scan.nextLine();

	    cityname = address.substring(0,address.indexOf(","));
	    System.out.println("City name: " + cityname + "\nlength: " + cityname.length());
	    
		// father's name?
	    String stringVariable, firstname, lastname;
	    stringVariable = "Pendragon, Uther";
		lastname = stringVariable.substring(0,9);
		firstname = stringVariable.substring(11);
	    System.out.println("Name: " + firstname + " " + lastname);

		// caption?
		String caption;
		System.out.print("Enter a caption for the image: ");
	    caption = scan.nextLine();

		System.out.println(caption + " has a length of " + caption.length() + ", and the character at the 4th subscript pos is \"" + caption.charAt(4) + "\"");
	}
}
