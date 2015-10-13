package edu.calstatela.mhsu.basicinheritance;
public class Rectangle extends GeometricObject {

	int width;
	int height;

	public Rectangle() {
	}

	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;

	}

	//from GeometricObject
	@Override
	public void calculateArea() {
		area = width * height;
	}

	//This is from java.lang.Object
	@Override
	public String toString(){
		return "rectange with width "+width+" and height "+height;
	}
}
