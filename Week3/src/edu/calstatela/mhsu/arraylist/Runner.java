package edu.calstatela.mhsu.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(20);
		numbers.add(40);
		numbers.add(50);
		numbers.add(100);

		//Shuffling the numbers
		Collections.shuffle(numbers);

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		//You can use your own classes, too
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		for(int i=0; i<100;i++){
			monsters.add(new Monster());
		}

		//Just like arrays, you can have a arraylist of superclass types, and you can put subtype objects in there.
		ArrayList<GeometricObject> shapes = new ArrayList<>();
		shapes.add(new Rectangle());
		shapes.add(new Circle());

	}


}
