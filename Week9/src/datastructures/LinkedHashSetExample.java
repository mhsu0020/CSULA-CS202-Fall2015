package datastructures;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	// Make a Set of unique strings

	public static void main(String[] args) {

		LinkedHashSet<Student> uniqueStudents = new LinkedHashSet<>();
		Student student1 = new Student("1234", "M", 20);
		Student student2 = new Student("5678", "M", 20);
		Student student3 = new Student("91011", "M", 20);

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
