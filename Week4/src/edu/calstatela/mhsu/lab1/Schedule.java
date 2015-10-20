package edu.calstatela.mhsu.lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Schedule {

	int unitsAvailable = 16;

	Course[] monday = new Course[4];
	Course[] tuesday = new Course[4];
	Course[] wednesday = new Course[4];
	Course[] thursday = new Course[4];
	Course[] friday = new Course[4];
	ArrayList<Course> availableCourses = new ArrayList<>();

	ArrayList<Course> signedUpCourses = new ArrayList<>();


	public Schedule() {
		Course cs202 = new Course("CS202 Object oriented programming", 5, "MonWed", "6:10PM - 9:45PM");
		Course cs203 = new Course("CS203 Data Structure and Algorithms", 4, "TuesThurs", "9:45AM - 11:45AM");
		Course cs204 = new Course("CS204 spaceship programming", 2, "Fri", "1:30PM - 3:30PM");
		Course cs205 = new Course("CS205 time machine", 10, "MonWed", "9:45AM - 11:45AM");
		Course cs206 = new Course("CS206 calculus programming", 5, "TuesThurs", "6:10PM - 9:45PM");

		availableCourses.add(cs202);
		availableCourses.add(cs203);
		availableCourses.add(cs204);
		availableCourses.add(cs205);
		availableCourses.add(cs206);
	}

	public void printAvailableCourses() {
		for (int i = 0; i < availableCourses.size(); i++) {
			System.out.println(i + ". " + availableCourses.get(i));
		}
	}

	public void printCurrentSchedule() {
		System.out.println("Monday: ");
		for (int i = 0; i < monday.length; i++) {
			if (monday[i] != null)
				System.out.println(monday[i]);
			else
				System.out.println("available");
		}
		System.out.println("Tuesday");
		for (int i = 0; i < tuesday.length; i++) {
			if (tuesday[i] != null)

				System.out.println(tuesday[i]);
			else
				System.out.println("available");
		}
		System.out.println("Wednesday");
		for (int i = 0; i < wednesday.length; i++) {
			if (wednesday[i] != null)
				System.out.println(wednesday[i]);
			else
				System.out.println("available");
		}
		System.out.println("Thursday");
		for (int i = 0; i < thursday.length; i++) {
			if (thursday[i] != null)
				System.out.println(thursday[i]);
			else
				System.out.println("available");
		}
		System.out.println("Friday");
		for (int i = 0; i < friday.length; i++) {
			if (friday[i] != null)
				System.out.println(friday[i]);
			else
				System.out.println("available");

		}

	}

	public void printCurrentClasses(){
		if(signedUpCourses.size()==0){
			System.out.println("No classes");
		}
		else{
			for (int i = 0; i < signedUpCourses.size(); i++) {
				System.out.println(i + ". " + signedUpCourses.get(i));
			}
		}


	}

	public void addClass(int indexOfClassToAdd) {
		Course classToAdd = availableCourses.get(indexOfClassToAdd);
		signedUpCourses.add(classToAdd);
		// 9:45AM - 11:45AM;
		String times = classToAdd.times;
		int timeSlotIndex = 0;
		switch (times) {
		case "6:10PM - 9:45PM":
			timeSlotIndex = 3;
			break;
		case "9:45AM - 11:45AM":
			timeSlotIndex = 0;
			break;
		case "1:30PM - 3:30PM":
			timeSlotIndex = 1;
			break;
		default:
			break;
		}
		// Format: MonWed
		String days = classToAdd.days;
		if (days.contains("Mon")) {
			monday[timeSlotIndex] = classToAdd;
		}
		if (days.contains("Tues")) {
			tuesday[timeSlotIndex] = classToAdd;
		}
		if (days.contains("Wed")) {
			wednesday[timeSlotIndex] = classToAdd;
		}
		if (days.contains("Thurs")) {
			thursday[timeSlotIndex] = classToAdd;
		}
		if (days.contains("Fri")) {
			friday[timeSlotIndex] = classToAdd;
		}

	}

	public void dropClass(int indexOfClassToDrop) {
		Course classToDrop = signedUpCourses.get(indexOfClassToDrop);
		signedUpCourses.remove(indexOfClassToDrop);

		// 9:45AM - 11:45AM;
		String times = classToDrop.times;
		int timeSlotIndex = 0;
		switch (times) {
		case "6:10PM - 9:45PM":
			timeSlotIndex = 3;
			break;
		case "9:45AM - 11:45AM":
			timeSlotIndex = 0;
			break;
		case "1:30PM - 3:30PM":
			timeSlotIndex = 1;
			break;
		default:
			break;
		}
		// Format: MonWed
		String days = classToDrop.days;
		if (days.contains("Mon")) {
			monday[timeSlotIndex] = null;
		}
		if (days.contains("Tues")) {
			tuesday[timeSlotIndex] = null;
		}
		if (days.contains("Wed")) {
			wednesday[timeSlotIndex] = null;
		}
		if (days.contains("Thurs")) {
			thursday[timeSlotIndex] = null;
		}
		if (days.contains("Fri")) {
			friday[timeSlotIndex] = null;
		}

	}

	public void saveSchedule() {
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\CS202Lab1Schedule.txt");
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			for (int i = 0; i < signedUpCourses.size(); i++) {
				writer.write(signedUpCourses.get(i).nameOfClass);
				writer.newLine();
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}

	public void loadScheduleFromFile() {
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\CS202Lab1Schedule.txt");
		Charset charset = Charset.forName("US-ASCII");
		List<String> allCourseNamesInFile = new ArrayList<String>();
		try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
		allCourseNamesInFile = Files.readAllLines(path, charset);
		} catch (IOException x) {
		    //System.err.format("IOException: %s%n", x);
			return;
		}
		for (int i = 0; i < allCourseNamesInFile.size(); i++) {
			String courseName = allCourseNamesInFile.get(i);
			for (int j = 0; j < availableCourses.size(); j++) {
				if(availableCourses.get(j).getNameOfClass().equals(courseName)){
					this.addClass(j);
				}
			}

		}


	}

}
