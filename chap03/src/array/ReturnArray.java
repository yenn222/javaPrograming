package array;

public class ReturnArray {

	static int[] makeArray() {
		//int temp[] =  {1, 2, 3, 4, 5};
		int temp[] = new int[5];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = i + 1;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		int intArray[];
		
		intArray = makeArray(); // new int[...] 과 동일한 처리 
		for (int value : intArray) {
			System.out.println(value);
		}
	}

}
