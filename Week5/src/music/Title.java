package music;

import java.util.ArrayList;

public class Title {
	private String albumTitle;
	private Artist artist;
	private ArrayList<Track> tracks;

	public Title(String albumTitle){
		this.albumTitle = albumTitle;
		this.tracks = new ArrayList<Track>();
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void addTrack(Track track) {
		this.tracks.add(track);
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String toString(){
		StringBuilder outputBuilder = new StringBuilder(this.albumTitle+"\n"+this.artist.toString()+"\n");
		for (int i = 0; i < tracks.size(); i++) {
			outputBuilder.append("\t");
			outputBuilder.append(tracks.get(i).toString());
			outputBuilder.append("\n");
		}
		return outputBuilder.toString();
	}




}
