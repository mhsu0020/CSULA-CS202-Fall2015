package music;

public class ConcertArtist extends Artist{

	private int numberOfConcertsPerYear;

	public ConcertArtist(String artistName, String gender, int age, int numberOfConcertsPerYear) {
		//Because parent doesn't have default constructor, must call parent constructor
		super(artistName, gender, age);
		this.numberOfConcertsPerYear = numberOfConcertsPerYear;

	}

	public int getNumberOfConcertsPerYear() {
		return numberOfConcertsPerYear;
	}

	public void setNumberOfConcertsPerYear(int numberOfConcertsPerYear) {
		this.numberOfConcertsPerYear = numberOfConcertsPerYear;
	}

	@Override
	public String toString() {
		return super.toString()+","+numberOfConcertsPerYear;
	}

}
