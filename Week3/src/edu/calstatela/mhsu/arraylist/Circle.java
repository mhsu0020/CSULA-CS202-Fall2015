package edu.calstatela.mhsu.arraylist;
public class Circle extends GeometricObject {

	int radius;

	public Circle() {
	}
	public Circle(int radius){
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		area = radius * radius * Math.PI;
	}

}
