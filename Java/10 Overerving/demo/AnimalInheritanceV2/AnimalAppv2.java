package AnimalInheritanceV2;

public class AnimalAppv2 {

	public static void main(String args[]) {


		Cat kitty1 = new Cat();
		Cat kitty2 = new Cat("Sasha", "Tuna", "RingingBall");

		Bird birdy1 = new Bird();
		Bird birdy2 = new Bird("Tweety", "SquidBack", "The acme Song");

		Animal birdy3 = new Bird();
		
		System.out.println(Animal.counter);
		System.out.println(Bird.counter);
		
		System.out.println(birdy3.counter);
		System.out.println(birdy2.counter);
		
		Animal kitty3 = new Kitty();
		
		System.out.println(kitty3 instanceof Animal);
		System.out.println(kitty3 instanceof Cat);
		System.out.println(kitty3 instanceof Kitty);
		System.out.println(kitty3 instanceof Bird);
	}
}
