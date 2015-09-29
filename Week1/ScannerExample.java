import java.util.Scanner;
/**
 *	Scanner example demonstrating how to read user input
 *
 * */
public class ScannerExample {

	public static void main(String[] args) {
		// Before we use any methods in a scanner, we must create a Scanner
		// objcet
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type in a number:");
		int numberTyped = scanner.nextInt();
		System.out.println("you typed in the number: "+numberTyped);

		//nextInt() doesn't read the line break, so we need to consume that
		scanner.nextLine();

		System.out.println("Type a line:");
		String lineTyped = scanner.nextLine();
		System.out.println("you typed : "+lineTyped);



		//Close the scanner at the end to free up system resources
		scanner.close();
	}

}
