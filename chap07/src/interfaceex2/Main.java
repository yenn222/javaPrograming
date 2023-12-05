package interfaceex2;

public class Main {

	public static void main(String[] args) {
		Television tv = new Television();
		
		//인터페이스 참조변수가 인터페이스를 구현한 클래스 객체를 참조할 수 있음.
		RemoteControl rc = new Television(); //인터페이스 레퍼런스로 인터페이스 구현
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		rc = new Audio();
		
		RemoteControl.changeBattery();
		
	}

}
