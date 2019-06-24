package LaunchableApp;

public class TennisBall extends Ball {

	public TennisBall(String brandName) {
		super(brandName);
	}

	@Override
	public void bounch() {
		System.out.println("de bal botst na werpen" + (int) (Math.random() * 10));
	}

	@Override
	public void launch() {
		System.out.println("Ik bots de tennis bal eerst op de grond en daarna smijt ik ze in de lucht");
		bounch();		
	}

}
