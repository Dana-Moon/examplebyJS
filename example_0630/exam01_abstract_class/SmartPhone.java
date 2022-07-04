package example_0630.exam01_abstract_class;

public class SmartPhone extends Phone {

	//추상 클래스를 상속 받았다. 부모 클래스의 생성자를 사용함.
	public SmartPhone(String owner) {
		super(owner);
	}
	//메서드_부모클래스로 형변환 할 경우, 자식 클래스 메소드 사용할 수 없다.
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
