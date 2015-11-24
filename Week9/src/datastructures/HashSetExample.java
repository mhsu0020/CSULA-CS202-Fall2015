package datastructures;

import java.util.HashSet;

public class HashSetExample {
	//Make a Set of unique strings

	public static void main(String[] args){

		HashSet<String> uniqueWords = new HashSet<>();

		uniqueWords.contains("one");

		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");
		uniqueWords.add("one");

		for(String word : uniqueWords){
			System.out.println(word);
		}

		HashSet<Student> uniqueStudents = new HashSet<>();

		Student student1 = new Student("1234", "M", 20);
		Student student2 = new Student("5678", "M", 20);
		Student student3 = new Student("91011", "M", 20);

		uniqueStudents.add(student1);
		uniqueStudents.add(student2);
		uniqueStudents.add(student3);

		for(Student student : uniqueStudents){
			System.out.println(student);
		}



	}
}
