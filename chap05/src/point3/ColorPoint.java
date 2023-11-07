package point3;

import point2.Point;

public class ColorPoint extends Point {
	
	private String color;
	
//	public ColorPoint() { //디폴트 생성자가 만들어짐 
		//흐름 예상 
		//Point();
		// ....
	//}
	 
	public ColorPoint() {
		super(); //내 상속 클래스의 생성자 호출 //컴파일러가 해줌
		System.out.println("ColorPoint 생성자 호출");
	}
	
	public ColorPoint(final int x, final int y, final String color) {
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint Full 생성자 호출");
	}
	
	void setColor(final String color) {
		this.color = color;
	}
	
	void set(final int x, final int y, final String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.println(color);
		showPoint();
	}

}

