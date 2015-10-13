package edu.calstatela.mhsu.usefulclasses;

public class PrimitiveWrapperTypeExample {

	public static void main(String[] args) {

		Integer[] integerObjectArray = {new Integer(0), new Integer(1)};

		//Auto unboxing
		System.out.println(integerObjectArray[0]+integerObjectArray[1]);
		String numberString = "123445";

		Integer parseNumber = Integer.valueOf(numberString);
		System.out.println(parseNumber+100);


	}

}
