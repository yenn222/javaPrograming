package interfaceex2;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("볼륨을 올립니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println();
		
	}

	@Override
	public void setVolume(int voulme) {
		System.out.println();
		
	}
	
}
