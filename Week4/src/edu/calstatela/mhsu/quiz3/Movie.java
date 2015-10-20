package edu.calstatela.mhsu.quiz3;

public class Movie {

	private String name;
	private double IMDBScore;

	public Movie(){
		this.name = "Martian";
		this.IMDBScore = 9.8;
	}
	public Movie(String name, double iMDBScore) {
		this.name = name;
		IMDBScore = iMDBScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIMDBScore() {
		return IMDBScore;
	}
	public void setIMDBScore(double iMDBScore) {
		IMDBScore = iMDBScore;
	}
	public void showTheaters(){
		System.out.println("In all major theaters");
	}



}
