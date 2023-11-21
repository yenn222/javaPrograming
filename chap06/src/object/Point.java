package object;

public class Point {
	private int x;
	private int y;
	
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//toString 재정의
//	@Override
//	public String toString() {
//		return "Point("+ x + ", " + y + ")";
//		
//	}
	
	//equals 재정의 
	//@Override
	public boolean equals(Point point) {
		if (this.x == point.x && this.y == point.y) {
			return true;
		}else {
			return false;
		}
	}
}
