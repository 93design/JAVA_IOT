package AnimalInheritanceAbstract;

public class Bird extends Animal{
	
	private String favSong = "";
	public static int counter = 0;
	
	Bird() {
		this("","","");
	}
	
	Bird(String name, String favFood,String favSong) {
		super(name,favFood);
		this.favSong = favSong;
		counter++;
	}
	
	public void moveAround() {
		fly();
	}

	public void fly() {
		System.out.println("Bird is flying aroudn the block");

	}

}
