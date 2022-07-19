package example_0719_exception.excep.sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			fis.close();	//이 객체를 사용해서 계속 메모리에 사용하면, 자원의 문제가 생긴다. 따라서 자원을 썼으면 닫아줘야 한다. 그런데 여기서는 괄호 안에서 try catch가 끝나면 닫는다는 식으로 말해준 것임.(?)
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다");
		}
	}//이 예제는 일부러 에러를 만든 경우라서, 좋은 예제라고 보기 어렵다.
}
