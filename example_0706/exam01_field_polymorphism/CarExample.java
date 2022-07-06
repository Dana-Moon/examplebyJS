package example_0706.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
//		example_car();
		abc();
	}



	public static void example_car() {
		Car myCar = new Car();

		myCar.run();

		System.out.println("______check001______");

		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();

		System.out.println("______check002______");

		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();

//		System.out.println("______check003______");

		myCar.run();
	}

	public static void abc() {
		Car car = new Car();
		car.brake();
	}
}
