
public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y; //소수점이있는실수나누기
		System.out.println(z);
	
		//잘못된 코드 
		double z2 = z + 2;
		System.out.println(z2);
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));//not a number
		
		double z3 =  y / y;
		System.out.println(Double.isNaN(z3));//not a number
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출을 할 수 없습니다.");
		} else {
			System.out.println(z + 2);
		}
	}

}
