package example_0701_multi_implement.RemoteControl;

public class Audio implements RemoteControl{
    private int volume;

    
    //turnOn() 추상 메소드의 실체 메서드 반드시 구현하라고 알려주기 위해 interface가 있는 것.
    public void turnOn() {
        System.out.println("소리를 켭니다.");
    }

    public void turnOff() {
        System.out.println("소리를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);
    }
}
