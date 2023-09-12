
public class PrintfEx {

	public static void main(String[] args) {
		int a = 3, b = 3;
		
		System.out.println("a =" + a + ", b = " + b);
		System.out.printf("a = %d, b = %d\n", a, b);
		System.out.println(); //줄바꿈 방법 중 하나 
		System.out.printf("a = %d, b = %d\n", a, b);
		
		double c = 0.5;
		System.out.printf("a = %d, b = %d, c = f\n", a, b, c);
//		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c); //형변환 거부 //예외처리 파트

		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n", 0.5);
		System.out.printf("%.2f\n", 0.5); //소수점 이하 몇자리 
		System.out.printf("%10.2f\n", 0.5);
		System.out.printf("0123456789");
	}

}
