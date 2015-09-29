
public class IfElseSwitch {

	public static void main(String[] args) {
		int x = 20 / 3;
		if (x > 20) {
			System.out.println("x is greater than 20");
		} else if (x > 10) {
			System.out.println("X is greater than 10");
		} else {
			System.out.println("X is smaller than 10");
		}

		//Works just like an if-else statement
		int y = 30;
		switch (y) {
		case 10:
			System.out.println("y is 10");
			break;
		case 20:
			System.out.println("y is 20");
			break;
		case 30:
			System.out.println("y is 30");
			break;
		default:
			break;
		}

	}

}
