package example_0630.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	public String efg;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
}

