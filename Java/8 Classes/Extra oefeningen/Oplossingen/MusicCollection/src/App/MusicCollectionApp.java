package App;

import Album.Album;

public class MusicCollectionApp {

	public static void main(String[] args) {
		
		Album album1 = new Album("Pruple Rain", "Prince", new String[]{"Let's go crazy - 4:39", "Take me with u -3:54"}, 1984);
		
		System.out.println(album1.getArtist());
		
		Album albumMix = new Album("Mix it Up", "Jamie", new String[]{"Hi Ho, let's Go - 4:39", "Cocaine -3:54"}, 2019);
		
		System.out.println(albumMix.getArtist());

		System.out.println(albumMix);
		
		albumMix.addSong("the K.K.K. took my baby away - 2:55");
	
		System.out.println(albumMix);
	}
}
