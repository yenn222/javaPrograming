package object;

public class ObjectPropertyEx {

	public static void main(String[] args) {
		
		Point point = new Point(2, 3);
		
		System.out.println(point.getClass().getName()); //ClassName
		System.out.println(point.hashCode()); //10진수
		System.out.println(point.toString()); //classname@hashcode(16진수)
		System.out.println(point);
		

	}

}
