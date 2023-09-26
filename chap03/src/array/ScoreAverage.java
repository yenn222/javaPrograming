package array;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = { // score -> [4][2]
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.2, 2.5} };
		
		for(int year = 0; year < score.length; year++) {
			System.out.printf	("%d학년 : ", year+1);
			for(int term = 0; term < score[0].length; term++) {
				System.out.print("  " + score[year][term]);
			}
			System.out.println();
		}
	
		for(int year = 0; year < score.length; year++) {
			System.out.printf	("%d학년 : ", year+1);
			double yearScore[] = score[year]; // 2개 있는 배열을 가르키게 되는 것.
			for(int term = 0; term < yearScore.length; term++) {
				System.out.print("  " + yearScore[term]);
			}
			System.out.println();
		}
	}
}
