
public class PassByValueExample {

	// Primitives: make a copy of the value of x
	public static void changePrimitveVariable(int x) {
		x = 20;
	}

	// Reference type: make a COPY of the memory address of circle
	public static void changeCircle(Circle circle) {
		circle.setRadius(2);
	}

	// Reference type: make a COPY of the memory address of circle
	public static void createNewCircle(Circle oldCircle) {
		Circle circle2 = new Circle();
		circle2.setRadius(42);
		oldCircle = circle2;
	}

	public static void main(String[] args) {

		// Passing primitive type variable to parameter
		int x = 1;
		PassByValueExample.changePrimitveVariable(x);
		System.out.println(x);

		// Passing reference type variable to parameter, using the mutator
		// methods to change it
		Circle circleOne = new Circle();
		PassByValueExample.changeCircle(circleOne);
		System.out.println(circleOne.getRadius());

		// Setting circle to a new Circle object in createNewCircle DOES NOT
		// change it
		Circle circle = new Circle(100);
		PassByValueExample.createNewCircle(circle);
		System.out.println(circle.getRadius());

	}

}
