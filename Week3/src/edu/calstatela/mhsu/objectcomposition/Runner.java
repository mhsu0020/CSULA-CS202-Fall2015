package edu.calstatela.mhsu.objectcomposition;

public class Runner {

	public static void main(String[] args) {

		//this is "hardcoding"
		Instructor instructor = new Instructor("Michael", 1234);
		Student studentOne = new Student("David", 343243);
		Student studentTwo = new Student("John", 1211223);

		Course CS202 = new Course(instructor, new Student[]{studentOne, studentTwo});


	}

}
