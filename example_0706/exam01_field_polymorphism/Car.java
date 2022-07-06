package example_0706.exam01_field_polymorphism;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	Number01_brake num1 = new Number01_brake();

	Brake brake01 = new Number01_brake();

	Pedal pedal01 = new Number01_brake();
	public Tire[] tires = {
		new newHankookTire(),
		new newHankookTire(),
		new newHankookTire(),
		new newHankookTire(),
	};

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();

		for(Tire tire : tires) {
			tire.roll();
		}
	}

	public void brake() {
		num1.push();
		num1.stop();
		pedal01.push();

		System.out.println("__________run01__________");

		brake01.stop();

		System.out.println("__________run02__________");

		Number01_brake brake02 = (Number01_brake) brake01;
		brake02.push();

		System.out.println("__________run03__________");

		brake02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new KumhoTire();
		brake02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new newHankookTire();
		brake02.defaultmethod_install_pedal(frontRightTire);

		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
