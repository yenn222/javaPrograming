package staticex;

public class Main {

	public static void main(String[] args) {
//		Calc calc = new Calc();
		
//		System.out.println(calc.max(10, 20));
//		System.out.println(calc.min(10, 20));
		
		System.out.println(Calc.max(10, 20)); //객체를 생성하지 않아도 불러올 수 있음 

		Calc.enable = true;
		System.out.println(Calc.enable);
		
		Calc calc = new Calc();
		calc.value = 100;
		
		Calc calc2 = new Calc(); //같은 클래스의 모든 객체가 공유함.
		calc2.value = 200;
		
		System.out.println(calc.value);
		System.out.println(Calc.value);

		calc.print();
		calc.printstatic();
	}

	
}
