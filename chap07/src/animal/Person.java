package animal;

public class Person {

	private String name;
	
	//1. 배열 생성 같이 진행 
//	private Animal[] companions = new Animal[5];
	
	private Animal[] companions;
	private int companionCount;
	
	//2. 배열은 생성자에서 생성
	public Person(final String name, final int count) { //동물 마리수를 지정해줄 수 있음.
		this.name = name;
		this.companions = new Animal[count];
		this.companionCount = 0; //매개변수 넘길 필요 없음. (내부에서만 사용)
	}
	
	public void addCompanion(final Animal animal) { //수퍼클래스의 참조변수는 서브 클래스의 참조변수를 가질 수 있음.
		//animal을 삽입할 위치를 알아야 함.
		this.companions[this.companionCount] = animal;
		this.companionCount++;
	}
	
	public void soundAll() {
		for(int i = 0; i < this.companionCount; i++) {
			Animal companion = this.companions[i]; //upcasting 추가로 공부하
			companion.sound(); //동적 바인딩으로 호출 
		}
		
	}
	
}
