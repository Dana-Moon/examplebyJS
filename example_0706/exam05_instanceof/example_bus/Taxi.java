package example_0706.exam05_instanceof.example_bus;

public class Taxi implements Vehicle, Hipass {
	public static String taxi = "택시";
	public void run() {
		System.out.println("택시가 달린다!!");
	}
	public void pay(String input_human) {
		System.out.println(input_human+"이(가) "+taxi+" 요금을 냅니다.");
	}


}
