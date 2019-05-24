package CarOefeningV5;

import java.util.Random;

public class RandomUtil {
	
	public static String randomColor() {
		Random randy = new Random(); 
		String [] colorArray = {"white", "red","black"};
 		
		int randomNumber = randy.nextInt(3);
		
		String randomColor = colorArray[randomNumber];
		return randomColor;
		
	}

}
