package LaunchableApp;

public abstract class Ball implements Launchable{
	
	private String brandName;

	public Ball(String brandName) {
		super();
		this.brandName = brandName;
	}
	
	public abstract void bounch();
	
	

}
