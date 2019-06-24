package LaunchableApp;

public class BasketBall extends Ball {

	public BasketBall(String brandName) {
		super(brandName);
	}

	@Override
	public void bounch() {
		int bounces = (int) (Math.random() * 5);
		System.out.println("de bal botst na scoren" +   bounces);
		
		double	totalPower = bounces * GRAVITY;
		System.out.println("totalPower" + totalPower);
	}

	@Override
	public void launch() {
		System.out.println("Ik bots de Basket bal eerst op de grond en daarna smijt ik ze naar het goal");
		bounch();	
	}

}
