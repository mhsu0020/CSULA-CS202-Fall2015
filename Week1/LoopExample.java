
public class LoopExample {

	public static void main(String[] args) {

		//While loop
		int counter =0;
		while (counter<20) {
			System.out.println("While-loop Counter is "+counter);
			counter++;
		}

		//For-loop
		for(int forLoopCounter=0;forLoopCounter<20;forLoopCounter++)
		{
			System.out.println("For-loop Counter is "+forLoopCounter);
		}

		//Do-while loop
		int doWhileLoopCounter = 30;
		do {
			System.out.println("does it at least once");
		} while (doWhileLoopCounter<5);

	}

}
