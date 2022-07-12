package example_0706.exam05_instanceof.example_driver.driver;

public class Newby extends DriverName {
    private String drivertire = "초보자";
    ;private int maxspeed = 30;
//    public void speed(String input_driver_name) {
//        System.out.println(input_driver_name+"은 초보자처럼 30km 속도 이하로 주행합니다.");
//    };

    @Override
    public void speed(String input_driver_name, String input_location) {
        System.out.println(input_driver_name+"은(는) "+input_location+"에서 "+this.drivertire+"처럼 최대 "+this.maxspeed+"km/h 미만으로 주행합니다.");
    };
}
