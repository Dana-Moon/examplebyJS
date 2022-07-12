package example_0706.exam05_instanceof.example_driver.driver;

public class Master extends DriverName {
    private String drivertire = "전문가";
    private int minspeed = 100;
    private String location = "고속도로";
//    public void speed(String input_driver_name) {
//        System.out.println(input_driver_name+"은 전문가처럼 100km 속도로 주행합니다.");
//    };
    @Override
    public void speed(String input_driver_name, String input_location) {
        System.out.println(input_driver_name+"은(는) "+this.location+"에서 " +this.drivertire+"처럼 최대 "+this.minspeed+"km/h 이상으로 주행합니다.");
    };
}
