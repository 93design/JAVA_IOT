package AnimalInheritanceV2;

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
	
	@Override
	public String toString() {
		return "Bird [favSong=" + favSong + ", favFood=" + favFood + "]";
	}

	public void fly() {
		System.out.println("Bird is flying aroudn the block");
	}

	@Override
	public void moveAround() {
		fly();
		
	}

}
