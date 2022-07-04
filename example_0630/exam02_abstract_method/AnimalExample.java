package example_0630.exam02_abstract_method;


public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		//null이라고 할당해준 것임.
		//Animal은 추상클래스라 인스턴스 만들 수 없다. 그런데 자식 클래스를 넣어주어 자동 타입 변환해줌.
		Animal animal = null;	//메모리 구조적으로 볼 때, Animal animal은 stack에 넣고, null은 heap에 넣는다. '선언 = 할당'임을 알 것.
		//animal : (주소) -> (주소) : null 이 된 것이다.
		//new Dog() 라고 선언된 인스턴스가 있다. 그리고 아랫줄을 보면 animal이라는 변수를 호출하면, new Dog()를 부르도록 할당하였다.
		animal = new Dog();	//자동 타입 변환
		//인스턴스에 sound가 있는지 확인(오버라이딩 되었을 때, 있을 것이다.)
		animal.sound();
		System.out.println(animal.kind);
		// System.out.println(animal.efg);

		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		//Animal 이란 타입의 animal stack에서 찾아보니, heap에 new Dog() 인자가 들어간 것이다.
		animal.sound();

		//힙에 있는 멍멍, 야옹 사운드를 가져오게 된다.
	}
}
