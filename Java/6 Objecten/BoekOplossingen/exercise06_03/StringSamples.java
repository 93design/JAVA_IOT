package be.intecbrussel.basis.exercise06_03;

public class StringSamples {
   public static void main(String[] args) {

      
      
      String text1 = "Hallo";
      String text2 = "world";
      
      
      int compare = text1.compareTo(text2);
      System.out.println(compare);
      
      
      for (int i =0; i <text1.length(); i++) {
    	  char temp = text1.charAt(i);
    	  System.out.print(temp + ",");
      }
   }
}
