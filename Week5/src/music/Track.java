package music;

public class Track {
	private String trackName;
	private int trackLengthInMiliseconds;

	public Track(String trackName, int trackLengthInMiliseconds) {
		this.trackName = trackName;
		this.trackLengthInMiliseconds = trackLengthInMiliseconds;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public int getTrackLengthInMiliseconds() {
		return trackLengthInMiliseconds;
	}

	public void setTrackLengthInMiliseconds(int trackLengthInMiliseconds) {
		this.trackLengthInMiliseconds = trackLengthInMiliseconds;
	}

	@Override
	public String toString() {
		return "Track [trackName=" + trackName + ", trackLengthInMiliseconds=" + trackLengthInMiliseconds + "]";
	}


}
