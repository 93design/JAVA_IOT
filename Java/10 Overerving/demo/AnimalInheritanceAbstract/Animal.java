package AnimalInheritanceAbstract;

public abstract class Animal {
		
	private String name = ""; 
	public String favFood = "";
	public static final int EYES = 2;
	public static int counter = 0;
	Animal() {
		super();
		counter++;
	}
	

	
	Animal(String name, String favFood) {
		this.name = name;
		this.favFood = favFood;
		counter++;
	}
	
	protected final void changeName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setFood(String favFood) {
		this.favFood = favFood;
	}
	
	public String getFavFood() {
		return this.favFood;
	}
	
	public final void eatStuff() {
		System.out.println("this animal is eating his favorite food:" + favFood);
	}
	
	public void moveAround() {
		System.out.println("animal is moving around");
	}
	
	
	
	

}
