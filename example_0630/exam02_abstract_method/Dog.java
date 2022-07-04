package example_0630.exam02_abstract_method;

public class Dog extends Animal {
	public String efg = "abc";

	public Dog() {
		efg = "efg";
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}