package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {

		//Edible edible = new Person("David");
		ArrayList<Dance> objectsThatDance = new ArrayList<>();
		Duck duck = new Duck();
		Person person = new Person("Mike", 1234);
		Person person1 = new Person("Dave", 1);
		Person person2 = new Person("Mary", 90);
		Person person3 = new Person("Larry", 999999999);
		Person person4 = new Person("John", -100000);

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(person);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);

		System.out.println("Before sort: ");
		for (Person personInside : persons) {
			System.out.println(personInside.CIN);
		}

		Collections.sort(persons);

		System.out.println("after sort:");
		for (Person personInside : persons) {
			System.out.println(personInside.CIN);
		}

		objectsThatDance.add(person);
		objectsThatDance.add(duck);

		for (Dance danceObject : objectsThatDance) {
			danceObject.doDanceMove();
			danceObject.cheerForOthers();
			System.out.println(Dance.MAX_DANCE_MOVES);
			Dance.printCurrentTime();
		}

	}

}
