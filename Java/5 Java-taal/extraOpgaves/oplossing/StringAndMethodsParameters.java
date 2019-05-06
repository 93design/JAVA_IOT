package ExtraOpgavesOplossing;

public class StringAndMethodsParameters {
	
	
	public static void main(String[] args) {
		
	}
	
	public static boolean isPalindroom(String string) {
		boolean result = true;

		StringBuilder BeforeReverseString = new StringBuilder(string);
		String AfterReverseString = BeforeReverseString.reverse().toString();

		result = (string.toLowerCase()).equals(AfterReverseString.toLowerCase());
		return result;

	}


}
