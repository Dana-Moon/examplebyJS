package example_0701_multi_implement.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	public void turnOn() {
		System.out.println("소리를 켭니다.");
	}

	public void turnOff() {
		System.out.println("소리를 끕니다.");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + volume);
	}

	public void search(String url) {
		int channel = Integer.parseInt(url);

		if (channel < 15) {
			System.out.println("10채널로 변경됩니다.");
		} else if (channel < 22) {
			System.out.println("20채널로 변경됩니다.");
		} else if (channel < 72) {
			System.out.println("25채널로 변경됩니다.");
		} else {
			System.out.println("120채널로 변경됩니다.");
		}

	}
}
