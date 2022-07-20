package example_0719_exception.excep.multi_catch;

public class CatchByExceptionKindExample {
    public static void catchexam1() {
        try {
            String[] arg = {"1", "2", "3"};
            String data1 = arg[0];
            String data2 = arg[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("���� �Ű����� ���� �����մϴ�.");
            System.out.println("[���� ���]");
            System.out.println("java CatchByExceptionKindExample num1 num2");
            e.printStackTrace();    //�̰��� ����ϸ� ��� ������ ������ �� �� �ִ�.
        } catch (NumberFormatException e) {
            System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
        } finally {
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
        }
    }
}
