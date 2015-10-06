import java.util.Arrays;
import java.util.Scanner;

public class LabStaticExample {

	static String[] nameArray = { "Tom", "Jerry", "Mary", "Michael" };

	public static void changeName(int index, String newName) {
		if (index >= 0 && index < LabStaticExample.nameArray.length) {
			nameArray[index] = newName;
		}
		System.out.println("name at index " + index + " changed to " + newName);

	}

	public static void printCurrentName() {
		System.out.println(Arrays.toString(LabStaticExample.nameArray));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Pick an action: ");
			System.out.println("\t1. print current name array");
			System.out.println("\t2. change name");
			System.out.println("\t3. quit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				LabStaticExample.printCurrentName();
				break;
			case 2:
				System.out.println("Enter index to change, range 0 to " + (LabStaticExample.nameArray.length - 1));
				int index = scanner.nextInt();
				// read linebreak
				scanner.nextLine();

				System.out.println("Enter new name: ");
				String newName = scanner.nextLine();
				LabStaticExample.changeName(index, newName);

				break;
			case 3:
				scanner.close();
				System.exit(0);
				break;
			default:
				break;
			}

		}

	}

}
