package abstractclasses;

public class Rectangle extends GeometricObject{

	int width;
    int height;

    public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
    }

	@Override
	public int calculateArea() {
		return width*height;
	}

}
