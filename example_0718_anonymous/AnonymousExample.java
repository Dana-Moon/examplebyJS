package example_0718_anonymous;

import example_0718_anonymous.anony.*;
import example_0718_anonymous.nesting.*;

public class AnonymousExample {
	public static void main(String[] args) {
		nesting();
	}

	public static void anony() {
		Anonymous anony = new Anonymous();
		//1. 필드값으로 익명 객체 사용(익명 객체 필드 사용)
		anony.field.wake();
		//2. 메소드(지역변수)로 익명객체 사용(익명 객체 로컬변수 사용)
		System.out.println("----anony.method1();----");
		anony.method1();
		//3. 매개변수로 익명객체 사용 (이외에도 또 많지만, 교과서에서는 이것까지만 다룸, 익명 객체 매개값 사용)
		System.out.println("----anony.method2();----");
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					@Override
					public void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
		);
	}

	public static void exampleA() {
		A a = new A();
		A.B  b = a.new B();
		b.field1 = 3;
		b.method1();
		//A.B b = A.new B();
	}

	public static void exampleS() {
		//S s = new S();
		S.C c = new S.C();	//S 객체 생성할 필요없이 바로 생성할 수 있다.

		c.field3 = 3;		//인스턴스 필드 사용
//		S.C.field3 = 3;
		S.C.field4 = 5;		//정적 필드 사용
		c.method3();		//인스턴스 메소드 사용
		S.C.method4();		//정적 메소드 사용
	}

	public static void nesting() {
		DD dd = new DD();

		//인스턴스 멤버 클래스 객체 생성
		DD.BB bb = dd.new BB();
		bb.field5 = 5;
		bb.method5();

		//정적 멤버 클래스 객체 생성
		DD.CC cc = new DD.CC();
		cc.field7 = 7;
		DD.CC.field8 = 8;
		cc.method7();
		DD.CC.method8();

		//로컬 클래스 객체 생성을 위한 메소드 호출
		dd.methodE();
	}
}
