package example_0630.exam01_abstract_class;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자 이것은 오버로딩이다.
	public Phone(String owner) {
		this.owner = owner;
	}
	
	
	//메서드_인터페이스는 아래 내용(시스아웃) 없지만, 추상 클래스는 있다.
	public void turnOn() {
		System.out.println("핸드폰 전원을 켭니다.");
	}	
	public void turnOff() {
		System.out.println("핸드폰 전원을 끕니다.");
	}
}
