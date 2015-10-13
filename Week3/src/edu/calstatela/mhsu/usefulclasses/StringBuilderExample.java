package edu.calstatela.mhsu.usefulclasses;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("zzzzzz");
		for (int i = 0; i < 100; i++) {
			//Not creating new strings, reusing same StringBuilder object
			s.append("a");
		}

		String resultString = s.toString();

		System.out.println(resultString);

	}

}
