package person;

public class AtheleteMain {

	public static void main(String[] args) {
		Athelete[] atheletes = new Athelete[4];
		atheletes[0] = new BaseballPlayer("홍길동", 183, 70.3, 21);
		atheletes[1] = new BasketballPlayer("홍길동", 183, 70.3, "LG");
		atheletes[2] = new BaseballPlayer("임예은", 183, 70.3, 21);
		atheletes[3] = new BasketballPlayer("임예은", 183, 70.3, "LG");
		
		for( Athelete athelete : atheletes ){
			athelete.print();
			System.out.println("------------");
		}
	}

}
