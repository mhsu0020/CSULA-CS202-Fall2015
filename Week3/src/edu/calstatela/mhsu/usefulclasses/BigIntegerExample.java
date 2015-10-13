package edu.calstatela.mhsu.usefulclasses;
import java.math.BigInteger;

public class BigIntegerExample {

	public static void main(String[] args) {

		BigInteger testBigIntOne = new BigInteger("1");
		BigInteger testBigIntTwo = new BigInteger("12121212121212121212122112121121212121212121212121212");
		testBigIntOne = testBigIntOne.add(testBigIntTwo);

	}

}
