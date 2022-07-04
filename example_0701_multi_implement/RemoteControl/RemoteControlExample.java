package example_0701_multi_implement.RemoteControl;

import java.util.Scanner;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// Searchable sc = new SmartTelevision(); 이것도 만들 수 있다.

		// RemoteControl.changeBattery();
		// // RemoteControl.setMute(true);
		// // default 메서드는 사용할 수 없다.

		// Audio audio_A = new Audio();
		// audio_A.turnOn();
		// audio_A.setVolume(30);
		// audio_A.setMute(true);
		// audio_A.turnOff();

		
		// System.out.println("start");
		String input = "";
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		System.out.println(input + "채널이 입력되었습니다.");
		tv.search(input);

		// RemoteControl rc = tv;
		// Searchable searchable = tv;
	}
}
