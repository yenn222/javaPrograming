package lib;
//abstract class - 추상 클래스 
// 객체를 생성할 수 없음
public abstract class Calculator { // 추상 클래스 
	public int add(int a, int b) { 
	return a + b;
} 
	public abstract int subtract(int a, int b);//추상 메소드 
	public abstract double average(int[] a);
}
