package com.javaex.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {
		
		Song song1 = new Song();
		Song song2 = new Song();
		Song song3 = new Song();
		
		song1.setTitle("좋은날");
		song1.setArtist("아이유");
		song1.setAlbum("Real");
		song1.setComposer("이민수");
		song1.setYear(2010);
		song1.setTrack(3);
		
		song2.setTitle("거짓말");
		song2.setArtist("BIGBANG");
		song2.setAlbum("Always");
		song2.setComposer("G-DRAGON");
		song2.setYear(2007);
		song2.setTrack(2);
		
		song3.setTitle("벚꽃엔딩");
		song3.setArtist("버스커버스커");
		song3.setAlbum("버스커버스커1집");
		song3.setComposer("장범준");
		song3.setYear(2012);
		song3.setTrack(4);
		
		
		song1.showInfo(song1.getArtist(),song1.getTitle(),song1.getAlbum(),
				song1.getYear(),song1.getTrack(),song1.getComposer());
		song2.showInfo(song2.getArtist(),song2.getTitle(),song2.getAlbum(),
				song2.getYear(),song2.getTrack(),song2.getComposer());
		song3.showInfo(song3.getArtist(),song3.getTitle(),song3.getAlbum(),
				song3.getYear(),song3.getTrack(),song3.getComposer());
		
	}

}
