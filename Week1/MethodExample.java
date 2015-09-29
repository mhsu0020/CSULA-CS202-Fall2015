
public class MethodExample {

	//a static method
    public static void printMessage(String messageToPrint){
    	System.out.println(messageToPrint+"!!!!!!!!!!!!!");
    }

	public static void main(String[] args) {

		 //You can use static methods by doing className.method
		 MethodExample.printMessage("Michael Hsu");

	}

}
