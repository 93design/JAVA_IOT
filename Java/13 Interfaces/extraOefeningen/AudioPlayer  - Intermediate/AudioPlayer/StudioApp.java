package AudioPlayer;

public class StudioApp {

	public static void main(String[] args) {


		Studio herman = new Studio();
		
		//DvdPlayer dvdPlayer = new DvdPlayer();		
		//herman.fillEquiment(dvdPlayer,0);
		
		System.out.println(herman.dvdPlayer.sound);

		herman.dvdPlayer.Play();
		System.out.println(herman.dvdPlayer.sound);

	
		herman.dvdPlayer.Pause();
		System.out.println(herman.dvdPlayer.sound);

	
	}

}
