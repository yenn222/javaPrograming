package person;

public class BaseballPlayer extends Athelete {
	private int age;
	
	public BaseballPlayer(final String name, final double height, final double weight, final int age) {
		super(name, height, weight);
		this.age = age;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(age);
	}
	
	public void print2() {
		print();
		System.out.println(age);
	}
}