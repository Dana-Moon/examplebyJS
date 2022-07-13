package example_0712_highwayChange;

import example_0712_highwayChange.driver.*;
import example_0712_highwayChange.check.CheckPrint;

public class Highwaymain {
    public static void main(String[] arg) {
        String[] G = {"천안", "고속도로", "고속도로", "고속도로", "서울", "알수없음"};

        Car A = new Car();
        highwaySimulation(A, G);
    }

    private static void highwaySimulation(Car startCar, String[] goway) {
        for(String index : goway) {
            System.out.println("현재 위치는 "+index+"입니다");
            CheckPrint.viewLocation(index);
            startCar.setDriver(CheckPrint.fixDriver(index));
            System.out.println("[현재 최고 속도는]");
            System.out.println(CheckPrint.getLimitSpeed(startCar.getDriver()));
            System.out.println("[입니다]");
        }
    }
}
