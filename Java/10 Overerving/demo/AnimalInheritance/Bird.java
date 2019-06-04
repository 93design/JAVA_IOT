package AnimalInheritance;

public class Bird extends Animal{
	
	private String favSong = "";
	
	Bird() {
		super();
	}
	
	Bird(String name, String favFood,String favSong) {
		super(name,favFood);
		this.favSong = favSong;
	}
	
	public void moveAround() {
		fly();
	}

	public void fly() {
		System.out.println("Bird is flying aroudn the block");

	}

}
