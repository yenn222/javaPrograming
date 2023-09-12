import java.util.Scanner; //Scanner class 사용.

public class ScannerEx2 {	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Number = ");
//		int number = scanner.nextInt();
//		System.out.println(number);
//	
//		System.out.print("Id = ");
//		String id = scanner.next();
//		System.out.println(id);
//		scanner.nextLine();
//		
//		System.out.print("Full Name = ");
//		String fullName = scanner.nextLine();
//		System.out.println(fullName);
		
		String name = scanner.next();
		System.out.println("이름 : " + name);
		
		String city = scanner.next();
		System.out.println("도시 : " + city);
		
		int age = scanner.nextInt();
		System.out.println("나이 : " + age);

		double score = scanner.nextDouble();
		System.out.println("성적 : " + score);

		boolean aaa = scanner.nextBoolean();
		System.out.println("aaa : " + aaa);
		
		scanner.close(); //반드시 제일 마지막에 입력할 것
	}

}
