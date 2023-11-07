package car;

public class Car {
	// 멤버 변수는 private을 사용하는 것이 원칙 
	private int speed;
	private boolean stop; //다른 클래스에서 접근할 수 없음 
	
	//다른 패키지에서도 사용하고 싶으므로 public 사용함
	//같은 패키지에서 사용할 것이므로 default 사용함 
	public int getSpeed()  { //getter
		return speed;
	}
	
	public void setSpeed(int speed) { //setter
		if(speed < 0 ) {
			this.speed = 0;
		} else {
		this.speed = speed;
		}
	}
	
	public boolean isStop() { //boolean getter
		return stop; //기본값 false
	}
	
	public void setStop(boolean stop) { //setter
		this.stop = stop;
	}
}
