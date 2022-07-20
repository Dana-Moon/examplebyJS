package example_0718_anonymous.anony;

public class Person implements WayToWork{
	public void wake() {
		System.out.println("_normal_ 7시에 일어납니다.");
	}

	public void run() {
		System.out.println("달리다.");
	}

	public void car() {
		System.out.println("차가 달립니다.");
	}
}
