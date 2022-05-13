package CBS;

public class Character_class {

	public static void main(String[] args) {
		char test = 'A'; //only a variable
		Character test2 = 'B';
		
		System.out.println(test2.isUpperCase(test2));//Determine if a character is uppercase
		System.out.println(test2.isLowerCase(test2));//Determine if a character is lowercase
		System.out.println(test2.isWhitespace(test2));//Check if a character is blank
		System.out.println(test2.isLetter(test2));//Determine if a character is a letter
		System.out.println(test2.isDigit(test2));//Determine if a character is a number
		System.out.println(test2.isISOControl(test2));
		System.out.println(test2.charValue());
		System.out.println(test2.toLowerCase(test2));
		System.out.println(test2.toUpperCase(test2));
	}

}
