package example_0630.exam02_abstract_method;

public class Cat extends Animal {
	
	public String kind;

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
