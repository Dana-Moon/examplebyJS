package example_0706.exam05_instanceof.example_bus;

import example_0706.exam05_instanceof.example_bus.Bus;
import example_0706.exam05_instanceof.example_bus.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle, String input_name) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare(input_name);
		}
		vehicle.run();
	}

}
