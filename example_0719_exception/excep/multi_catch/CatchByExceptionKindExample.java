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
            System.out.println("샐행 매개값의 수가 부족합니다.");
            System.out.println("[실행 방법]");
            System.out.println("java CatchByExceptionKindExample num1 num2");
            e.printStackTrace();    //이것을 사용하면 어디서 에러가 났는지 알 수 있다.
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }
    }
}
