package person;

public class BasketballPlayer extends Athelete{
	private String carrer;
	
	public BasketballPlayer(final String name, final double height, final double weight, final String carrer) {
		super(name, height, weight);
		this.carrer = carrer;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(carrer);
	}
	
	public void print3() {
		print();
		System.out.println(carrer);
	}
}
