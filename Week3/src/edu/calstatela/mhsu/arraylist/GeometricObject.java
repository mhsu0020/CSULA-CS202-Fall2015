package edu.calstatela.mhsu.arraylist;
import java.awt.Color;

public class GeometricObject {
	double area;
	Color color;

	public GeometricObject(){
		System.out.println("GeometricObject Contructor called");
	}

	public void calculateArea(){
	}

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}




}
