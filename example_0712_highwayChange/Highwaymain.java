package example_0712_highwayChange;

import example_0712_highwayChange.driver.*;
import example_0712_highwayChange.check.CheckPrint;

public class Highwaymain {
    public static void main(String[] arg) {
        String[] G = {"õ��", "��ӵ���", "��ӵ���", "��ӵ���", "����", "�˼�����"};

        Car A = new Car();
        highwaySimulation(A, G);
    }

    private static void highwaySimulation(Car startCar, String[] goway) {
        for(String index : goway) {
            System.out.println("���� ��ġ�� "+index+"�Դϴ�");
            CheckPrint.viewLocation(index);
            startCar.setDriver(CheckPrint.fixDriver(index));
            System.out.println("[���� �ְ� �ӵ���]");
            System.out.println(CheckPrint.getLimitSpeed(startCar.getDriver()));
            System.out.println("[�Դϴ�]");
        }
    }
}
