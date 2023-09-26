package chap01;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하시오(1월 ~ 12월): ");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		}
		scanner.close();
	}
}