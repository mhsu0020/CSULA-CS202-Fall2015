
public class LogicalOperators {

	public static void main(String[] args) {

		int x = 20;
		int y = 300;

		if (x > 30 && y > 30) {
			System.out.println("both greater than 30");
		}
		if (x > 30 || y > 30) {
			System.out.println("one of them greater than 30");
		}

		if (x > 10 ^ y > 10) {
			System.out.println("only one is greater than 30");
		}

		if(!(x>100)){
			System.out.println("X is not greater than 100");
		}

	}

}
