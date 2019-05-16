package Harry_The_Array;

import java.util.Arrays;

public class DictionaryV2 {

		public static void main(String[] args) {			
			
			String[] words = getWords(40);
			
			for(String word: words) {
				System.out.println(word);
			}
		}

		private static String[] getWords(int length) {			
							char[] charArray = new char[length];
			String[] temp = new String[((length*26)-length)+1];
			for (int i = 0; i < charArray.length; i++) {
				charArray[i] = 'a';
			}
			int wordCount = 0; 	
			temp[wordCount++] = new String(charArray);
			
			for (int i = 0; i < charArray.length; i++) {
				for(int j = 1; j <26; j++) {
					charArray[i]++;	
					temp[wordCount++] = new String(charArray);
										
					
				}
				
			}
			
			return temp;
		}
}
