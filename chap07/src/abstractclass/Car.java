package abstractclass;

public class Car {
	
	Tire[] tires = new Tire[4];
	
	public void run() {
		for(Tire tire: tires) {
			tire.roll();
		}
	}
}
