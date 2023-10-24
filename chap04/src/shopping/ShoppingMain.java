package shopping;

public class ShoppingMain {

	public static void main(String[] args) {
		Customer me = new Customer("Yenniii", "임예은", "20221038@gmail.com", "덕명동", 0);
		Customer you = new Customer("Waname", "이은채", "20221032@gmail.com", "노은동", 10);

		me.print();
		you.print();
	}
}
