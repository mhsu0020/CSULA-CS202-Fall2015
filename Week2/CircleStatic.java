import java.util.Scanner;

/**
 *
 * all data fields are static, meaning it is shared between all instances of the class
 *
 * */
public class CircleStatic {

	static double radius;


    public CircleStatic(){
    }

      public double getRadius(){
    	return CircleStatic.radius;
    }

    public void setRadius(double radius){
    	CircleStatic.radius = radius;
    }

	public double getArea(){
		double area = Math.PI * CircleStatic.radius *CircleStatic.radius;
		return area;
	}

}
