package person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person[] persons = new Person[4];
		persons[0] = new Person("홍길동", "1234");
		persons[1] = new Student("홍길동", "1234", "모바일융합공학과", 4.4);
		persons[2] = new StudentWorker("홍길동", "1234", "모바일융합공학과", 4.4, "CTO");
		persons[3] = new Student("홍길동", "1234", "모바일융합공학과", 4.4);
		
		for(Person person : persons) {
			person.print();
			System.out.println("------------------");
		}
	}
}
