package animal;

public class MovableCat extends Animal implements Movable {
	
	public MovableCat(final String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(this.getName() + "가 야옹합니다 ");
	}
	
	@Override
	public void move() {
		System.out.println("고양이 " + this.getName() + "가 움직입니다. ");
	}
}
