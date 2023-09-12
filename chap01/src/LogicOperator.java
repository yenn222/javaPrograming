
public class LogicOperator {

	public static void main(String[] args) {
		boolean result = 3 >= 2;
		System.out.println(result);
		
		System.out.println(3 == 2);
		
		System.out.println(!true);
		System.out.println(!(3 == 2));

		System.out.println(true && false);
		System.out.println(false && true); //Dead Code -> 불필요한 코드 

		System.out.println(true || false); //단축 연산, 단락 연산 
		
		System.out.println((3 != 2) || (-1 > 0));


	}

}
