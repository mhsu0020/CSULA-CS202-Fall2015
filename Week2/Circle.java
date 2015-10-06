import java.util.Scanner;

public class Circle {

	//primitive data fields
	private double radius;

	boolean isCircleBigEnough;

	//reference type fields default to null
	String circleName;


    public Circle(){
         //Constructor overloading: calling Circle(double radius) with radius one
    	this(1.0);
    }

    public Circle(double radius){
    	this.radius = radius;
    }

    public double getRadius(){
    	return radius;
    }

    public void setRadius(double radius){
    	this.radius = radius;
    }

	public double getArea(){
		double area = Math.PI * this.radius *this.radius;
		return area;
	}

}
