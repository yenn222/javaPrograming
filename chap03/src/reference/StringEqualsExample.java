package reference;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		boolean diff = strVar1 == strVar2;
		System.out.println(diff);
		
		boolean diffContent = strVar1.equals(strVar2);
		System.out.println(diffContent);

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		boolean diffContent2 = strVar3.equals(strVar4); //참조값을 따라간 실제 내용을 비교 
		System.out.println(diffContent2);
		
		boolean diffContent3 = strVar1.equals(strVar4);
		System.out.println(diffContent3);

		boolean diff2 = strVar3 == strVar4;
		System.out.println(diff2);
		
		if (strVar3.equals(strVar4)) {
			System.out.println(" [1] strVar3와 strVar4는 문자열이 같음( 같은 내용임 )");
		} 
	
		if (strVar3 == strVar4) {
			System.out.println(" [2] strVar3와 strVar4는 문자열이 같음( 같은 내용임 )");
		} 
	}

}
