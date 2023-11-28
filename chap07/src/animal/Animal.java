package animal;

public abstract class Animal {
	private String name;

	Animal(final String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract void sound();
}
	
