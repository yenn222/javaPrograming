package person;

public class Athelete {
	private String name;
	private double height;
	private double weight;
	

	public Athelete(final String name, final double height, final double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
	}
}
