package access.q;

class C {
	public void k() {
		B b = new B();
		b.n = 7; // 다른 클래스 멤버 접근 -> 접근 지정자에 따라 결정 
		b.g();
	}
}
