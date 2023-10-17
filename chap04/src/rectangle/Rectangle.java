package rectangle;


// 가로width, 세로height 속성 만들기
// 면적 구하기 getArea

public class Rectangle {
	int width;
	int height;
	
	int getArea() {
		return width * height;
	}
	
	// main 함수를 생성해서
	// 4 * 5 크기의 직사각형을 만들고 면적을 출력하시오.
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(); // 객체 생성 후 참조
		rectangle.width = 4;
		rectangle.height = 5;
		
		System.out.println("사각형의 면적은 " + rectangle.getArea());
		
		
	}
}

