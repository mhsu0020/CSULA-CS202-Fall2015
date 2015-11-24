package datastructures;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	// Make a Set of unique strings

	public static void main(String[] args) {

		// TreeSet<String> stringExample = new TreeSet<>();
		//
		// stringExample.add("xerox");
		// stringExample.add("zoidberg");
		// stringExample.add("adam");
		// stringExample.add("rick");
		// stringExample.add("morty");
		//
		// for(String word : stringExample){
		// System.out.println(word);
		// }

		TreeSet<Student> uniqueStudents = new TreeSet<>(

		(Student o1, Student o2) -> new Integer(o1.age).compareTo(o2.age));
		Student student3 = new Student("91011", "M", 20);
		Student student2 = new Student("5678", "M", 1000);
		Student student1 = new Student("1234", "M", 1);

		uniqueStudents.add(student1);
		uniqueStudents.add(student2);
		uniqueStudents.add(student3);

		// for(Student student : uniqueStudents){
		// System.out.println(student);
		// }

		int index = 0;
		Iterator<Student> itr = uniqueStudents.iterator();
		while (itr.hasNext()) {
			System.out.println(index);
			System.out.println(itr.next());
			index++;
		}

	}
}
