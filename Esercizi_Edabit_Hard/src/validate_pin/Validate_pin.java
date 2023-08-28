package validate_pin;

public class Validate_pin {
	
	public static boolean validate(String pin) {
		//Exactly 4 or 6 characters.
			// No whitespace.
			//Only numeric characters (0-9).
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(validate("javado"));
	}
}
