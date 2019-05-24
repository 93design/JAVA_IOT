package be.intecbrussel.basis.exercise05_16;
import java.util.*;

public class While5 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      //boolean voor controle van slagen while loop.
      boolean gelukt = false;
      
      //while (not False) ==> while(true) ==> while blijft lopen zolang gelukt op false blijft.
      while(!gelukt) {
    	  //input binnen while loop
    	  System.out.println("Geef uw getal tussen 0 en 10");
    	  int getal = keyboard.nextInt();
    	  if (getal > 0 && getal <10) {
    		  gelukt = true; //while(Not True) ==> while(false) ==> einde while loop
    		  System.out.println("uw getal was correct. getal = " + getal);
    	  } else {
    		  System.out.println("verkeerde invoer");
    		  gelukt = false;
    	  } 
    	      	  
      }
      
      keyboard.close();
   }
}