package array;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
//		int intArray []; // intArray라는 참조값 생성 
//		intArray = new int [5]; // 힙에 정수 5개를 참조값에 넣기
//		
//		int intArray2[] = new int [5]; // 함께 선언
//		
//		int[] intArray3 = new int [5];// 9line과 같은 것.
//		
//		int intArray4[] = { 1, 2, 3, 4, 5 }; //값을 먼저 힙에 채우고 참조값과 연결 
		
//		intArray[0] = 1;
//		intArray[1] = 2;
//		intArray[2] = 3;
//		intArray[3] = 4;
//		intArray[4] = 5;
		
		Scanner scanner = new Scanner(System.in);
;				
		int intArray[] = new int[5]; //new int[5]; 
		
		for (int i = 0; i < intArray.length; i ++) {
			intArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("intArray[%d] = %d\n", i, intArray[i]);
		}

		double sum = 0.0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.printf("합은 %.0f, 평균은 %.0f입니다\n", sum, sum / intArray.length);
		
//		System.out.println("length = " + intArray.length);
	}

}
