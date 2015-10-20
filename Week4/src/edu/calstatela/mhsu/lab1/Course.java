package edu.calstatela.mhsu.lab1;

//This represents one single course
public class Course {

	String nameOfClass;
	int units;
	//MonWed
	String days;
	//6:00PM - 9:45PM
	String times;

	public Course(String nameOfClass, int units, String days, String times) {
		super();
		this.nameOfClass = nameOfClass;
		this.units = units;
		this.days = days;
		this.times = times;
	}
	public String getNameOfClass() {
		return nameOfClass;
	}
	public void setNameOfClass(String nameOfClass) {
		this.nameOfClass = nameOfClass;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString(){
		return nameOfClass+" "+days+" "+times+" number of units: "+units;
	}

}
