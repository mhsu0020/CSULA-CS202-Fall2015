package abstractclasses;

import java.util.ArrayList;
import java.util.Collections;

import abstractclasses.GeometricObject;
import abstractclasses.Rectangle;

public class Runner {

	public static void main(String[] args) {

		ArrayList<GeometricObject> shapes = new ArrayList<GeometricObject>();
		GeometricObject object = new Rectangle("testRect", 20, 20);
		shapes.add(object);
		for (GeometricObject geometricObject : shapes) {
			geometricObject.printMessage();
			System.out.println(geometricObject.name);
			geometricObject.name = "new namehahaha";
			System.out.println(geometricObject.name);
			System.out.println(geometricObject.calculateArea());
		}

	}

}
