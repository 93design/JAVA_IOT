package LaunchableApp;

public class Rock implements Launchable, Skippable {

	@Override
	public void launch() {
		System.out.println("Ik smijt de steen naar het water en hoop dat hij skipt");
		skipping();	
	}

	@Override
	public void skipping() {

		System.out.println("de steen skipt " +  (int) (Math.random() * 65) + " keren ");
	}

}
