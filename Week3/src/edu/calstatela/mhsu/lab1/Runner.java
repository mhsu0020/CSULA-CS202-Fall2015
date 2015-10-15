package edu.calstatela.mhsu.lab1;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Schedule schedule = new Schedule();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("Select an option: ");
			System.out.println("1. Show current schedule");
			System.out.println("2. Sign up for a class");
			System.out.println("3. drop a class");
			System.out.println("4. Exit");
			int selection = scanner.nextInt();
			scanner.nextLine();
			switch (selection) {
			case 1:
				schedule.printCurrentSchedule();
				break;
			//Add a class
			case 2:
				schedule.printAvailableCourses();
				int courseChoice = scanner.nextInt();
				schedule.addClass(courseChoice);
				break;
			case 3:
				schedule.printCurrentClasses();
				int courseDropChoice = scanner.nextInt();
				schedule.dropClass(courseDropChoice);
				break;
			case 4:
				System.exit(0);
			default:
				break;
			}


		}

	}

}
