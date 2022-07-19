package example_0719_exception.excep.sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();	//throws에 의해 아래 exception 쪽으로 빠지게 된다.
			System.out.println("성공했습니다.");
		} catch(Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
//		} catch(ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다");
//		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}

