package AnimalInheritanceV2;

import java.util.Arrays;

public class AnimalAppv3 {

	public static void main(String args[]) {
		
		AllPets collection = new AllPets();
	
		Animal kitty1 = new Cat();
		Animal kitty2 = new Cat("Sasha", "Tuna", "RingingBall");

		Animal birdy1 = new Bird();
		Bird birdy2 = new Bird("Tweety", "SquidBack", "The acme Song");

		collection.setBrid(new Bird[] {(Bird) birdy1,birdy2});
		
		System.out.println(Arrays.toString(collection.getBrid()));
	}
}
