package example_0720_hash_deepclone.exam01_equals;

public class MemberExample {
	//String[] 배열은 OS(윈도우)에서 초기에 데이터를 받는 입구
	//static : 프로그램에서 딱 1개, 인스턴스 못 만듦.
	public static void main(String[] args) {
		student();

	}

	public static void redBlue() {
		//인스턴스 생성
		//선언 부분 : Member 타입으로 obj1 변수명으로 선언
		// = : 대입 연산자 (우측에 있는 인스턴스를 좌측에 있는 선언 부분에 할당(연결))
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");

		Member obj3 = new Member("red");

		//obj라는 객체가 3개가 할당된 상황(주소값)

		//equals 메서드를 써서 참조 타입 비교
		//기본 타입끼리 비교할 때는 == 사용
		//재정의된 equals 사용
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}

		//기존, obj3에 할당된 인스턴스 대신에 obj2의 인스턴스가 연결되어서
		//원래 있던 obj3에 할당된 인스턴스는 연결 끊어짐.(가비지 컬렉터가 찾아서 회수)
		//기존의 주소 날라감.
		obj3 = obj2;
		if(obj2.equals(obj3)) {
			System.out.println("obj2과 obj3은 동등합니다.");
		} else {
			System.out.println("obj2과 obj3은 동등하지 않습니다.");
		}
	}

	public static void student() {
		EqualsStudent student_1 = new EqualsStudent(1, "김준석");
		EqualsStudent student_2 = new EqualsStudent(2, "김준석");

		if(student_1.equals(student_2)) {
			System.out.println(student_1.getName()+"와(과) "+student_2.getName()+"은(는) 동일인물입니다.");
		} else {
			System.out.println("동일인물이 아닙니다.");
		}

		student_2.setTeamNumber(1);

		if(student_1.equals(student_2)) {
			System.out.println(student_1.getName()+"와(과) "+student_2.getName()+"은(는) 동일인물입니다.");
		} else {
			System.out.println("동일인물이 아닙니다.");
		}

		student_2.setName("이준석");
		if(student_1.equals(student_2)) {
			System.out.println(student_1.getName()+"와(과) "+student_2.getName()+"은(는) 동일인물입니다.");
		} else {
			System.out.println("동일인물이 아닙니다.");
		}
	}
}
