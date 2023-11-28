
public class ArrayIndexExceptionEx {

	public static void main(String[] args) {
		
		int[] intArray  = new int[5];
		
		try {
			
			intArray[0] = 10;
			intArray[1] = 20;
			intArray[2] = 30;
			intArray[3] = 40;
			intArray[4] = 50;
			intArray[5] = 60;			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위가 잘못됐어요!!");
		} catch (Exception e) {
			System.out.println("뭔가 잘못됐어요!!");
		}	
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(i + "번째 값은" + intArray[i]);
		}
	}

}
