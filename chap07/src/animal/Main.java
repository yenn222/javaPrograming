package animal;

public class Main {
	public static void main(String[] args) {
		
		Cat cat = new Cat("나비");
		Dog dog = new Dog("뽀삐");
		
		Person me = new Person("예은", 2);
		me.addCompanion(cat);
		me.addCompanion(dog);
		
		me.soundAll();
		

	}

}
