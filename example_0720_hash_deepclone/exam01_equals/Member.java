package example_0720_hash_deepclone.exam01_equals;

public class Member {
	public String id;

	//생성자(클래스를 토대로 인스턴스를 처음 만들 때 세팅하는 거)
	//String 매개 변수 id를 받아서 필드값 id에 할당(전달,대입)
	public Member(String id) {
		this.id = id;
	}

	//메소드 : 이 인스턴스가 갖고 있는 기능!
	//Object에 있는 equals 메소드를 재정의!
	//오버라이딩 : 상속을 받아서 제정의 하는 것. Member는 상속을 어디서?
	//모든 클래스는 Object라는 클래스에서 시작되며, 상속받습니다.
	//equals를 재정의 해서 새로운 비교구문을 스스로 만들기
	//@ : 어노테이션. 아래 메서드의 성질의 JVM에게 선언해주는 구문
	//Object가 최상위 타입이므로 모든 객체는 Object 타입으로 자동 타입 변환될 수 있음.
	@Override
	public boolean equals(Object obj) {
		//실제로 구현된 인스턴스의 타입은 Member이기 때문에 if문에 true가 뜬다.
		if(obj instanceof Member) {
			//Member 타입으로 obj의 형변환
			//member라는 변수명으로 obj(주소)가 연결. 연결이 끊기는 것은 아니다.
			Member member = (Member) obj;
			//id = member의 필드값
			//id = String이기 때문에 참조타입이므로 equals를 통해 비교
			//인스턴스의 id라는 필드값과 매개변수 obj(member)의 id를 비교
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
