package edu.calstatela.mhsu.exceptions;

import java.util.Scanner;

public class ExceptionConsleExample {

	public static int readUserInt(){
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		int result = 0;
		try{
			result = Integer.parseInt(userInput);
		}catch(NumberFormatException e){
			System.out.println("Please type in a number");
		} finally{
			scanner.close();
		}

		return result;
	}

	public static void divideByANumber(int numberToDivideBy) throws Exception{
		if(numberToDivideBy == 0){
			throw new ArithmeticException("less than zero");
		}
		System.out.println(1.0/numberToDivideBy);
	}
	public static void main(String[] args) {
		try {
			ExceptionConsleExample.divideByANumber(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		ExceptionConsleExample.readUserInt();
	}

}
