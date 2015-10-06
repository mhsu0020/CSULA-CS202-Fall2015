
public class AreaSumRunner {

	public static void main(String[] args) {

		Circle[] circles = new Circle[4];
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i+1);
		}
		double areaSum = 0;
		for (int i = 0; i < circles.length; i++) {
			System.out.println("radius for circle at "+i+" "+circles[i].getRadius());
			System.out.println("area is "+circles[i].getArea());
			areaSum += circles[i].getArea();
			System.out.println("=====");
		}
		System.out.println("sum of area is "+areaSum);


	}

}
