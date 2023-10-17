package book;

public class Book {
	String title;
	String author;
	
	void setMember(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title) { // 생성자
//		this(t,  "작자미상"); //2개짜리 생성자 가는 길 만들기 
		setMember(title, "작자미상");
		System.out.println("Book1 생성자 호출");
//		title = t;
//		author = "작자미상";
		//...
		
	}

	//아래 생성자가 하는 일이 많다고 가정
	public Book(String ttitle, String author) { // 생성자
		setMember(title, author);
//		title = t;
//		author = a;
		System.out.println("Book2 생성자 호출");
		//...
	}

	public static void main(String[] args) {
//		Book javaBook = new Book("Java", "황기태");
		// 생성자 Book(String t, String a) 호
		Book bible = new Book("Bible");
		// 생성자 Book(String t) 호출


	}
}
