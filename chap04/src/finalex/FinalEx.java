package finalex;

public class FinalEx {
	int normal;
	final int finalValue; //단독 사용시 초기화가 필요함
	final static int STATIC_FINAL_VALUE = 100; //일종의 상수 개념 //상수는 모두 대문자, 스네이크 케이스 사용
	
	void f() {
		this.normal = 100;
//		this.finalValue = 20; //값을 변경할 수 없음 
	}
	
	public FinalEx(final int normal, final int finalValue) { //메소드의 매개변수에는 final을 쓰도록 ! 
		this.normal = normal;
		this.finalValue = finalValue;
//		normal = 100; //매개변수로 넘어간 변수에 대해서 수정 X
	}
}
