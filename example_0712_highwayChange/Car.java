package example_0712_highwayChange;

import example_0712_highwayChange.driver.*;
public class Car {
    private Driver driverType;
    public Car() {Driver driverType = new Beginner();}

//    public Car() {
//        driverType = new Beginner();
//    }

    public void setDriver(Driver input_driver) {
        driverType = input_driver;
        System.out.println("����̹��� ��ü �Ǿ����ϴ� : " + driverType.getClass().getName());
    }
    public Driver getDriver() {
        return driverType;
    }
}
