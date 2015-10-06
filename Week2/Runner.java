import java.util.Random;

public class Runner {

	public static void main(String[] args) {

		Circle circleTest = new Circle();
		circleTest.setRadius(200000);
		System.out.println(circleTest.getRadius());

		//Random Class Example
		Random randomOne = new Random(100);
		int counter = 0;
		while(counter<10){
			System.out.println(randomOne.nextInt(101));
			counter++;
		}


		//Static data field example:
		CircleStatic circStaticOne = new CircleStatic();
		circStaticOne.setRadius(20);
		CircleStatic circleStaticTwo = new CircleStatic();
		circleStaticTwo.setRadius(10000000);

		//radius should be 10000000, since it's static and shared among all instances of the class
		System.out.println(circStaticOne.radius);
		//proper way to access static variables
		System.out.println(CircleStatic.radius);

	}

}
