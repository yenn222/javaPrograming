package array;

import java.util.Scanner;

//문자열을 읽어서 원하는 문자열이 나타난 횟수를 출력하시
public class StringExercise {
	
	public static void main(String[] args) {
		// 10개의 문자열을 저장할 수 있는 문자열 배열 inputs를 선언/생성.
		
		Scanner scanner = new Scanner(System.in);
		
		String inputs[] = new String[10];
	
		// 10번 반복하면서 문자열을 읽어서 배열 inputs에 입력하시오.
		//foreach문 사용하면 안댐 아직 넣어준 값이 없어서
		
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = scanner.nextLine();
		}
		
		// 모든 입력된 문자열을 화면에 출력하시오.
		for (String input : inputs) {
			System.out.println(input);
		}
		
		//원하는 문자열의 횟수를 셉니다.
		int count = 0;
		for (String input : inputs) {
			if (input.equals("3")) {
//			if (input == "d") { 안
				count++;
			};
		}
		System.out.println("Count = " + count);
		scanner.close();
	}
}
