package interefaceex;
//인터페이스를 구현한다고 함 ( 추상 클래스를 상속하는 것처럼 )
public class TvRemoteControl implements RemoteControl {

	@Override
	public void changeBattery() {
		System.out.println("TV 리모콘 배터리 교체");
		
	}

}
