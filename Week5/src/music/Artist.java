package music;

public class Artist {
	private String artistName;
	private String gender;
	private int age;

	public Artist(String artistName, String gender, int age) {
		this.artistName = artistName;
		this.gender = gender;
		this.age = age;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Artist [artistName=" + artistName + ", gender=" + gender + ", age=" + age + "]";
	}

}
