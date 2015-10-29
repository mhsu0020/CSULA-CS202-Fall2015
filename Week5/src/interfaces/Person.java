package interfaces;

public class Person implements Edible, Dance, Comparable<Person>{

	private String name;

	public int CIN;

	public Person(String name, int CIN) {
		this.name = name;
		this.CIN = CIN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String howToEat() {
		return "Use their hands/feet to eat";
	}

	@Override
	public void doDanceMove() {
		System.out.println("Breakdance");
		String s = "abcd";
		String y = "bcdf";

		s.compareTo(y);
		}

	@Override
	public int compareTo(Person o) {
		//-1: current object is less than o
		//0: they're the same
		//1: current is greater than o
		if(this.CIN < o.CIN){
			return -1;
		}
		else if(this.CIN == o.CIN){
			return 0;
		}
		else{
			return 1;
		}

	}




}
