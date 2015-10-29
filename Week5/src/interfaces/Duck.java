package interfaces;

public class Duck implements Edible, Dance{

	@Override
	public void cheerForOthers() {
		System.out.println("ducks don't cheer");
	};

	@Override
	public String howToEat() {
		return "not using hands";
	}

	@Override
	public void doDanceMove() {
		System.out.println("waddles around");
	}

}
