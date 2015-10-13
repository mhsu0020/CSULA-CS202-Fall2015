package edu.calstatela.mhsu.basicinheritance;

public class Runner {

	public static void main(String[] args) {

		// Rectangle and Circle are subtypes of GeometricObject, which means we
		// can create a GeometricObject array that can store both of them
		GeometricObject[] shapes = new GeometricObject[2];
		GeometricObject shapeOne = new Rectangle(2, 2);
		GeometricObject shapeTwo = new Circle(2);

		shapes[0] = shapeOne;
		shapes[1] = shapeTwo;

		for (int i = 0; i < shapes.length; i++) {
			GeometricObject shape = shapes[i];
			// Calling the overriden toString methods in the subclasses. Java
			// does dynamic binding, it will figure out which toString to use,
			// starting from the most specific one
			System.out.println(shape);
			// Use instanceof to check if a superclass variable is an instance
			// of a subclass
			if (shape instanceof Rectangle) {
				// Explicit casting, from superclass to subclass. This is
				// checked at runtime and can fail.
				Rectangle testRectangle = (Rectangle) shape;
				System.out.println(testRectangle.width);
				System.out.println(testRectangle.height);
			} else {
				Circle testCircle = (Circle) shape;
				System.out.println(testCircle.radius);
			}
			// Calling override method, notice we don't need to know if it's a
			// rectangle or Circle
			shape.calculateArea();
			System.out.println(shape.area);
		}

	}

}
