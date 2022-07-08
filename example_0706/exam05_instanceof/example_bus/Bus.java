package example_0706.exam05_instanceof.example_bus;

public class Bus implements Vehicle, payment {
	public static String bus = "버스";
	public void run() {
		System.out.println("버스가 달린다!");
	}
	public void checkFare(String input_human) {
		System.out.println(input_human+"은(는) 버스비를 확인해요.");
	}
	public void pay(String input_human) {
		System.out.println(input_human+"이(가) " +bus+" 카드를 찍어요.");
	}
}
