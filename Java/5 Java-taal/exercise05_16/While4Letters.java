package be.intecbrussel.basis.exercise05_16;

public class While4Letters {
   public static void main(String[] args) {
      char character = 'A';
      do {
         System.out.println(character++);
      }
      while (character <= 'Z');
   }
}