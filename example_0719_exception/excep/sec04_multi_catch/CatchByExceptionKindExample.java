package example_0719_exception.excep.sec04_multi_catch;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String[] arg = {"1", "2", "3"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample  num1  num2");
			e.printStackTrace();	//이것을 사용하면 어디서 에러가 났는지 알 수 있다.
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다");
		} finally {
//			System.out.println("다시 실행해 보세요");
			System.out.println("완료 되었습니다.");
		}

	}
}
