import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		try { //여기서 발생하는 오류를 잡아 //넓은 범위를 잡아도 가능
			dividend = scanner.nextInt();
			divisor = scanner.nextInt();
		
			System.out.println(dividend / divisor);
			
		//catch는 순서대로 처리되므로 주의할 것. (unreachable)
		} catch(ArithmeticException e) { //예외 클래스  //여기서 처리
			System.out.println("수식 오류 " + e.getMessage());
			
		} catch(InputMismatchException e) { 
			System.out.println("입력 오류 " + e.getMessage());
//			e.printStackTrace();
		} catch(Exception e) { 
				System.out.println("기타 등등 " + e.getMessage());
		} finally {
			System.out.println("수행 끝");
		}
		
		System.out.println("예외처리됨");
		
		scanner.close();
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		findClass2();
		
	
	}

	public static void findClass() throws ClassNotFoundException { //날 호출한 곳으로 던져줄겨
		Class<?> clazz = Class.forName("java.lang.String2");
	}
	
	public static void findClass2() { //여기서 해결할게 
		try {
			Class<?> clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
