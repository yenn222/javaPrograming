package staticex;

public class Calc {
	
	static boolean enable;
	static int value;
	int other; //객체 생성시 만들어지는 변
	
	public static int max(int a, int b) {
		return ( a > b )? a : b;
	}
	
	public static int min(int a, int b) {
		return ( a < b )? a : b;
	}
	
	public void print() {
		System.out.println(this.enable);
		System.out.println(this.value);
		System.out.println(this.other); //객체가 있어야 사용할 수 있는 this
	}
	
	public static void printstatic() { //객체 없이도 사용할 수 있는 메소드 
		//System.out.println(this.enable); //this 사용 안됨
		System.out.println(value);		
		//System.out.println(other); //일반 멤버 변수 사용 안됨

	}
	
}
