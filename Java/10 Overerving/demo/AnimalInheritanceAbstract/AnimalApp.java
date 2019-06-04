package AnimalInheritanceAbstract;

public class AnimalApp {

	public static void main(String args[]) {

		Animal ani1 = new Animal();
		Animal ani2 = new Animal("Robert", "frikadellen");

		System.out.println(ani1);

		ani1.changeName("Maurice");
		System.out.println(ani1.getName());
		ani2.eatStuff();
		ani2.moveAround();

		Cat kitty1 = new Cat();
		Cat kitty2 = new Cat("Sasha", "Tuna", "RingingBall");

		kitty1.moveAround();
		kitty1.eatStuff();
		kitty2.eatStuff();
		kitty2.moveAround();

		Bird birdy1 = new Bird();
		Bird birdy2 = new Bird("Tweety", "SquidBack", "The acme Song");

		birdy2.changeName("Animaniacs");

		System.out.println(birdy2.getName());
		birdy2.fly();
		Animal birdy3 = new Bird("Jako", "Citron", "De deurbel");

		birdy3.changeName("Ricardo");
		System.out.println(birdy3.getName());

		System.out.println(birdy3);

		Animal birdy4 = new Bird("Jako", "Seeeds", "De deurbel");
		Animal kitty3 = new Cat("Jako", "Birdys", "De deurbel");

		Animal[] animalArray = new Animal[3];

		animalArray[0] = birdy3;
		animalArray[1] = birdy4;
		animalArray[2] = kitty3;
		System.out.println("-----------------------------");
		System.out.println("all Animal are eating");

		if (kitty3 instanceof Bird) {
			System.out.println("this is a bird");
		} else {
			System.out.println("this is not a bird");
		}

		if (ani1 instanceof Animal) {
			System.out.println("this is a animal");
		} else {
			System.out.println("this is not a animal");
		}

		for (int i = 0; i < animalArray.length; i++) {
			animalArray[i].eatStuff();
		}

		for (Animal ani : animalArray) {
			ani.eatStuff();
			if (ani instanceof Bird) {
				Bird temp = (Bird) ani;
				temp.fly();
			}
		}

		Animal[] animalArray2 = { new Cat(), new Bird() };
		
		
		System.out.println(Animal.EYES);
		System.out.println(birdy3.EYES);
		
		System.out.println(Animal.counter);
		System.out.println(Bird.counter);

	}
}
