package shopping;

public class Customer {
	String id;
	String name;
	String mail;
	String address;
	int mileage;

	public Customer(String id, String name, String mail, String address, int mileage) {
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.address = address;
		this.mileage = mileage;
	}

	void print() {
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("이메일 : " + this.mail);
		System.out.println("주소 : " + this.address);
		System.out.println("마일리지 : " + this.mileage);
	}

	public void setMileage(int Mileage) {
		this.mileage = mileage;
	}
}
