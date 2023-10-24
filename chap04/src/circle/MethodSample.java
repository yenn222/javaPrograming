package circle;

public class MethodSample {
	
	//method overloading
	
	int getSum(int i, int j) { //주석처리하면 2개짜리가 형변환 되어 출
		System.out.println("getSum int");
		return i + j;
	}
	
	int getSum(int i, int j, int k) {
		return i + j + k;
	}
	
	double getSum(double i, double j) {
		System.out.println("getSum double");
		return i + j;
	}
	
//	double  getSum(int i, int j) { //코드 자로 형변환 시키는 것은 불
//		return (double)i + (double)j;
//	}

}
