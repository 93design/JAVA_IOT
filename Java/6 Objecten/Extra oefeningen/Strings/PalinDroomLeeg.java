package oplossingStudenten;

public class PalinDroomLeeg {
	//StringOefeningen_OEF

	public static void main(String[] args) {
		String klinkers = "qklfjqaayy";

		int nbrVowel = aantalKlinkers(klinkers);
		System.out.println(nbrVowel);
		/*
		 * Anna * Civic * Kayak * Level * Madam * Mom * Noon * Racecar * Radar Redder Refer Repaper
		 * Rotator * Rotor * Sagas * Solos * Stats * Tenet * Wow
		 * Don't nod *  I did, did I * My gym * Red rum, sir, is murder
		 * Step on no pets * Top spot * Was it a cat I saw
		 * Eva, can I see bees in a cave * No lemon, no melon
		 * De mooie zeeman nam Anna mee zei oom Ed
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
		boolean result = false;

		return result;

	}

	public static boolean isZinPalindroom(String string) {
		boolean result = false;
		

		return result;

	}


	public static boolean isUrl(String string) {
	//Ga na of er een url is ingegeven of niet. (Een url start met http://). 
		boolean result = false;
		return result;

	}

	public static int aantalKlinkers(String string) {
		int result = 0;
		return result;

	}

}
