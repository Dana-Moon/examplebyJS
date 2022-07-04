package example_0701_multi_implement.RemoteControl;

public interface RemoteControl {

	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	int BATTERY_COUNT = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드 (static이 없다. 인스턴스 없이 실행x)
	//default는 자식 클래스에서 생성할 필요가 없다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	//정적 메소드(인스턴스 없이 실행o)
	static void changeBattery() {
		System.out.println("배터리 교체");
	}
}
