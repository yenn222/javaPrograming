
public class AssignmentIncDecOperator {
	
	public static void main(String[] args) {
		
    	// 대입 연산자 사례
    	int a = 3, b = 3, c = 3; //초기화
//    	a = 3;
    	
    	//단축 대입 연산자
    	a += 3; // a = a + 3 = 6
    	b *= 3; // b = b * 3 = 9
    	c %= 2; // c = c % 2 = 1
    	
    	int longNameVariable = 1;
    	
    	longNameVariable = longNameVariable + 3;
    	longNameVariable += 3;
    	
    	System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    	
    	// 증감 연산자 사례
    	int d = 3;	
    	System.out.println("Before a = " + a + ", d = " + d);
    	a = d++; // a = 3, d = 4
//    	a = ++d; 
    	System.out.println("After a = " + a + ", d = " + d);
    	
    	a = ++d; // a = 5, d = 5
    	System.out.println("a = " + a + ", d = " + d);
    	
    	System.out.println("Before a = " + a + ", d = " + d);
    	a = d--; // a = 5, d = 4
    	System.out.println("After a = " + a + ", d = " + d);
    	
    	a = --d; // a = 3, d = 3
    	System.out.println("a = " + a + ", d = " + d);
    }
}
