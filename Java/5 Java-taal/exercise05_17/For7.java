package be.intecbrussel.basis.exercise05_17;

public class For7 {
   public static void main(String[] args) {
      for(int number = 0 ; number <= 10000; number++)  {
         if((number%6)==0 && (number%28) ==0)  {   
            System.out.println(number);
         }
      }
   }
}