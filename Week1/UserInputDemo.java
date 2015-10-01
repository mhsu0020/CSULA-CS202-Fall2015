import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("1. print message \n2. Quit ");
			int userInput = scanner.nextInt();
            switch (userInput) {
			case 1:
				System.out.println("hahahah");
				break;
			case 2:
				System.out.println("quit program, bye");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				break;
			}

		}


	}

}
