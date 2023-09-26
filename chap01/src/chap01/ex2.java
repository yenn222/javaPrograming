package chap01;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 개의 숫자를 입력하시오: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		scanner.close();
	}
}
