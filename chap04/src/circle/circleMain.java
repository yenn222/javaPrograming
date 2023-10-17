package circle;

public class circleMain {

	public static void main(String[] args) {
		
		Circle circle; // 객체 참조 변수
		
		circle = new Circle(); // 객체 생성 
		
		Circle pizza;
		pizza = new Circle(); // 참조 변수 생성해줘야함 //생성자 호출 
		
		System.out.println(pizza.name);

		pizza.name = "허리피자";
		pizza.radius = 10;
		
		double area = pizza.getArea(); // 메소드 사용, 멤버 함수 호출 
		
		System.out.println(area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "도우넛";
		
		System.out.println(donut.getArea());
		
		Circle egg = new Circle(2, "계란");
		System.out.println(egg.getArea());


	}

}
