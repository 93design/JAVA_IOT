package PalindroomApp;

public class PalinDroomApp {
	// StringOefeningen_OEF

	public static void main(String[] args) {
		String klinkers = "qklfjqaayy";

		int nbrVowel = aantalKlinkers(klinkers);
		System.out.println(nbrVowel);
		/*
		 * Anna Civic Kayak Level Madam Mom Noon Racecar Radar Redder Refer Repaper
		 * Rotator Rotor Sagas Solos Stats Tenet Wow
		 * 
		 * Don't nod * I did, did I * My gym * Red rum, sir, is murder Step on no pets *
		 * Top spot * Was it a cat I saw Eva, can I see bees in a cave * No lemon, no
		 * melon De mooie zeeman nam Anna mee zei oom Ed
		 */

		String palindroom = "abbba";
		boolean isPal = isPalindroom(palindroom);

		System.out.println("Is " + "\"" + palindroom + "\"" + " a palindroom?:" + isPal);

		String zinPalingroom = "De mooie zeeman nam Anna mee zei oom Ed";
		boolean isZinPal;
		isZinPal = isZinPalindroom(zinPalingroom);
		System.out.println("Is " + "\"" + zinPalingroom + "\"" + " a palindroom?:" + isZinPal);

		String url = "http://www.smartdeveloper.be";
		boolean isUrl = isUrl(url);
		System.out.println("Is " + "\"" + url + "\"" + " an URL?:" + isUrl);
	}

	public static boolean isPalindroom(String string) {
		boolean result = true;

		StringBuilder BeforeReverseString = new StringBuilder(string);
		String AfterReverseString = BeforeReverseString.reverse().toString();

		result = (string.toLowerCase()).equals(AfterReverseString.toLowerCase());
		return result;

	}

	public static boolean isZinPalindroom(String string) {
		boolean result = false;

		String temp = string.replace(",", "");
		temp = temp.replace("'", "");
		temp = temp.replace(" ", "");

		result = isPalindroom(temp);

		return result;

	}

	public static boolean isUrl(String string) {
		// Ga na of er een url is ingegeven of niet. (Een url start met http://).
		boolean result = true;
		result = string.startsWith("http://");
		return result;
	}

	public static int aantalKlinkers(String string) {
		// Tel het aantal klinkers (voyelles) in het woord/zin en print deze af.

		String vowel = "aeiouy";

		int result = 0;

		for (int i = 0; i < string.length(); i++) {
			char charPosInput = string.charAt(i);
			for (int j = 0; j < vowel.length(); j++) {
				char charPosVowel = vowel.charAt(j);
				if (charPosVowel == charPosInput) {
					result++;
				}

			}
		}
		return result;

	}

}
