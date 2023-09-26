package array;

import java.util.Scanner;

public class ForeachEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; 

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
		 
		for (int e : intArray) { //foreach
			System.out.println(e);
		}
		
		String fruits[] = {"사과", "배", "바나나", "체리", "딸기", "포도", "망고"};
		
//		for (int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
		
		for (String e : fruits) {
			System.out.println(e);
		}
		
		scanner.close();
	}
}