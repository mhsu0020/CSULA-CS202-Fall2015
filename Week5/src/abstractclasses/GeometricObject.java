package abstractclasses;

public abstract class GeometricObject {

	String name;

	public GeometricObject(String name){
		this.name = name;
	}

	public void printMessage(){
		System.out.println(this.name);
	}
	public abstract int calculateArea();

}
