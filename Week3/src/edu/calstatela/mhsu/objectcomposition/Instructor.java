package edu.calstatela.mhsu.objectcomposition;

public class Instructor {

	private String name;
	private int CIN;

public Instructor(String name, int CIN) {
	this.name = name;
	this.CIN = CIN;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCIN() {
	return CIN;
}

public void setCIN(int cIN) {
	CIN = cIN;
}



}
