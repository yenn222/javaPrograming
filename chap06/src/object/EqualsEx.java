package object;

public class EqualsEx {

	public static void main(String[] args) {

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		if ( a == b ) {
			System.out.println("a == b");
		}else {
			System.out.println("a != b");
		}
		
		if(a.equals(b)) { //재정의 가능
			System.out.println("a is equal to b");
		}else {
			System.out.println("a not equal to b");
		}
		
		if(a.equals(c)) { //재정의 가능
			System.out.println("a is equal to c");
		}else {
			System.out.println("a not equal to c");
		}
	}
}
