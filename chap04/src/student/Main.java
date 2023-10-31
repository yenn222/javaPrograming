package student;

public class Main {
	// 본인과 친구 한 명에 대한 정보로 구성된 객체 생성
	// 그리고 print 각각 호출하기
	public static void main(String[] args) {
		Student me = new Student(20221038, "모바일융합공학과", "임예은", "010-4733-3560");
//		Student you = new Student(20221032, "모바일융합공학과", "이은채", "010-3066-0747");
		
//		me = 20221038;
//		me.department = "모바일융합공학과";
//		me.name = "임예은";
//		me.phoneNumber = "010-4733-3560";

//		you.id = 20221032;
//		you.department = "모바일융합공학과";
//		you.name = "이은채";
//		you.phoneNumber = "010-3066-0747";

		me.print();
		
//		you.print();
	}

}
