package be.intecbrussel.basis.exercise05_16;

public class While4 {
   public static void main(String[] args) {
      char character = 65;
      do {
         System.out.println(character++);
      }
      while (character <= 122);
   }
}