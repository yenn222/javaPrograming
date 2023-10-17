package circle;

public class Circle { // 파스칼 케이스 
	//멤버 변수, 속성
	int radius;
	String name;
	
	//멤버 함수, 메소드
	double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	//디폴트 생성자 default constructor
//	//써주지 않아도 호출 됨 
	public Circle() {
		
	}
	//메소드 오버로딩
	//생성자 만들기
	
//	public Circle() { //클래스 이름과 동일하게
//		radius = 1; //초기화
//		name = "no name"; //초기화 
//	}
	
	//매개변수를 가지는 생성자 만들기
	public Circle(int radius, String name) {
			this.radius = radius;
			this.name = name;
	}
	
	public Circle(int radius) {
		this.radius = radius;
		this.name = "no name";
		
	}
}

	