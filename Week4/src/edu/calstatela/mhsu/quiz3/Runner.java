package edu.calstatela.mhsu.quiz3;

public class Runner {

	public static void main(String[] args) {
		Movie movieOne = new Movie("Crimson Peak", 6.8);
		Movie movieTwo = new DirectToTVMovie();

		movieOne.showTheaters();
		movieTwo.showTheaters();


	}

}
