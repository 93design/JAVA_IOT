package Album;

import java.util.Arrays;

public class Album {

	private String albumTitle = "";
	private String artist = "";
	private String[] albumSongArray;
	private int year = 0;
	
	public Album() {
		this("","",null,0);
	}
	
	public Album(String albumTitle, String artist, String[] albumSongArray, int year) {
		super();
		this.albumTitle = albumTitle;
		this.artist = artist;
		this.albumSongArray = albumSongArray;
		this.year = year;
	}
	
	public String getTitle() {
		return this.albumTitle;
	}
	
	public String getArtist() {
		return this.artist;
	}
	public String[] getSongs() {
		return this.albumSongArray;
	}
	public int getYear() {
		return this.year;
	}
	
	
	@Override 
	public String toString() {
		String temp = "Album = " + this.albumTitle + " Artist = " + this.artist + "\nSongs = " + Arrays.toString(albumSongArray) + "\nYear =" + year; 
		return temp;
	}
	
	//adding song to Array
	public void addSong(String extraSong) {
		String temp[] = new String[this.albumSongArray.length+1];
		for (int i = 0; i < this.albumSongArray.length; i++) {
			temp[i] = albumSongArray[i];
		}
		temp[albumSongArray.length] = extraSong;
		albumSongArray = temp;
	}
	
	public void addSong2(String extraSong) {
		this.albumSongArray = Arrays.copyOf(this.albumSongArray, this.albumSongArray.length +1);
		this.albumSongArray[this.albumSongArray.length -1] = extraSong;
	}
	
	
	
	
	
	
	
}
