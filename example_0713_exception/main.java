package example_0713_exception;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //Ʈ�����
        boolean checkTrue = false;
        String[] gameProcess = {"����", "����", "����", "����", "�������"};
        ArrayList<String> savePoint = new ArrayList<>();
        int SuccessCountSave = 0;

        try {
            for(String success : gameProcess) {
                if (success.equals("����")) {
                    System.out.println("1 -- ���� �Ͽ����ϴ�.");
                    savePoint.add(success);
                    SuccessCountSave++;
                } else if(success.equals("����")) {
                    throw new Exception("2 -- ���� �Ͽ����ϴ�.");
                } else {
                    System.out.println("���� �Դϴ�.");
                    throw new Exception("3 -- �� �� ���� �����Դϴ�.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            checkTrue = true;
            System.out.println("checkTrue : " + checkTrue);
            //��ΰ� �����ؾ� ��.
            //���� ���¿� �������� ã�Ƽ� ���ư���.
        } finally {
            System.out.println("���� ó���� ���μ����� ����մϴ�.");
            for (String saveContent : savePoint) {
                System.out.println(saveContent);
                //�α� ���
            }
        }
    }
}
