package example_0712_highwayChange.check;

import example_0712_highwayChange.driver.*;

public interface CheckPrint {
    final Beginner beginner = new Beginner();
    final Expert expert = new Expert();

    static enum city {õ��, ����};
    static enum highway {��ӵ���};
    static int getLimitSpeed(Driver input_Driver) {
        if(input_Driver instanceof Expert) {
            return input_Driver.getSpeed();
        }else if(input_Driver instanceof Beginner) {
            return input_Driver.getSpeed();
        }
        return 0;
    }
    static String viewLocation(String location) {
        for (city c : city.values()) {
            if (c.name().equals(location)) {
                return "���� �� �Դϴ�";
            }
        }
        for (highway h : highway.values()) {
            if (h.name().equals(location)) {
                return "��ӵ��� �Դϴ�";
            }
        }
        return "�̵� ���� �ƴմϴ�";
    }

    static Driver fixDriver(String location) {
        for (city c : city.values()) {
            if (c.name().equals(location)) {
                System.out.println("����̹� "+beginner.getClass().getName()+" ���� �����մϴ�");
                return beginner;
            }
        }
        for (highway h : highway.values()) {
            if (h.name().equals(location)) {
                System.out.println("����̹� "+expert.getClass().getName()+" ���� �����մϴ�");
                return expert;
            }
        }
        System.out.println("�� �� ���� ��ġ�� "+beginner.getClass().getName()+" ���� �����մϴ�");
        return beginner;
    }
}
