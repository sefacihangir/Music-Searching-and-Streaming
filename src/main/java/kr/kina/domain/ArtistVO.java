package kr.kina.domain;

public class ArtistVO {

	private String artist;
	private int rownum;

	public ArtistVO(){}
	
	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
