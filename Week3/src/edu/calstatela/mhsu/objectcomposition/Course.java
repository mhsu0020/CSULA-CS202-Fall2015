package edu.calstatela.mhsu.objectcomposition;

public class Course {
	Instructor instructor;
	Student[] students;

	public Course(Instructor instructor, Student[] students) {
		this.instructor = instructor;
		this.students = students;
	}
	//A instructor that teaches the class
	//Students that take the class
}
