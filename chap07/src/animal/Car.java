package animal;

public class Car implements Movable{
	
	private String type;
	private int year;

	public Car(final String type, final int year) {
		this.type = type;
		this.year = year;
	}
	
	@Override
	public void move() {
		System.out.println(year +"에 출시된 " + type + " 차량이 움직입니다. ");
	}
	
}
