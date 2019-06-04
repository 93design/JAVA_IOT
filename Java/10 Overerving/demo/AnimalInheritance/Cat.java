package AnimalInheritance;

public class Cat extends Animal{
	
	private String favToy;
	
	Cat() {
		super();
	}
	
	Cat(String name,String favFood,String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}
	
	@Override
	public void moveAround() {
		System.out.println("Kitty is seaking around the block");
	}
	
	

}
