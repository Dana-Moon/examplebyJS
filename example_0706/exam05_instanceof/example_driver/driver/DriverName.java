package example_0706.exam05_instanceof.example_driver.driver;

import example_0706.exam05_instanceof.example_driver.location.Navi;

public abstract class DriverName {
    public void speed(String input_driver_name, String input_location) {
        System.out.println(input_driver_name+"은(는) "+input_location+"에서 최대 km/h로 주행합니다.");
    };
}
