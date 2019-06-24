package LaunchableApp;

public class LaunchAbleApp {

	public static void main(String[] args) {
		
		Ball jordan = new BasketBall("Spalding");
		Ball roger = new TennisBall("Slazinger");
		
		Rock theRock = new Rock();
		
		System.out.println(Launchable.GRAVITY);
		//theRock.launch();
		//jordan.launch();
		//roger.launch();
		
		Launchable[] launchers = new Launchable[3];
		
		
		launchers[0] = jordan;
		launchers[1] = theRock;
		launchers[2] = roger;
		
		for (Launchable l: launchers) {
			l.launch();
			if (l instanceof Skippable) {
				System.out.println("the rock is awesome");
			}
		}
	}

}
