
public class StringExample {

	public static void main(String[] args) {
		String s = "hallo";
		s.replace('a', 'e');

		//s is still "hallo", remember Strings are immutable
		System.out.println(s);

		//More String instance methods
		System.out.println(s.substring(1, 4));
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(0));

	}

}
