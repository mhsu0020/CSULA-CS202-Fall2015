
public class ArrayExample {

	public static void main(String[] args) {

		//Create new array, specifying the length. Note that all elements in arrayExample are 0
		int[] arrayExample = new int[10];

		//Create new array using array literal
		int[] arrayExample1 = {2, 4, 90, 8, 7};

		//Accessing array elements
		System.out.println("first element in arrayExample1 is: "+arrayExample1[0]);

		//Using forloop to iterate through array
		for (int i = 0; i < arrayExample.length; i++) {

			//for each element at index i, do the following
			arrayExample[i] = 20;
		}

	}

}
