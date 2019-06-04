package AnimalInheritanceV2;

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
		System.out.println("Kitty is sneaking around the block");
	}

	@Override
	public String toString() {
		return "Cat [favToy=" + favToy + "]";
	}
	
	

}
