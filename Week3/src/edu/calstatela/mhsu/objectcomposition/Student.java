package edu.calstatela.mhsu.objectcomposition;

public class Student {

	private String name;
	private int CIN;

public Student(String name, int CIN) {
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
