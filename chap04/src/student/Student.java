package student;

public class Student {

	int id;
	String department;
	String name;
	String phoneNumber;

	void print() {
		System.out.println("학번 " + this.id);
		System.out.println("학과 " + this.department);
		System.out.println("이름 " + this.name);
		System.out.println("연락처 " + this.phoneNumber);
	}
	
	public Student(int id, String department, String name, String phoneNumber) {
		this.id = id;
		this.department = department;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}

