package example_0718_anonymous;

import example_0718_anonymous.anony.*;
import example_0718_anonymous.nesting.*;

public class AnonymousExample {
	public static void main(String[] args) {
		nesting();
	}

	public static void anony() {
		Anonymous anony = new Anonymous();
		//1. �ʵ尪���� �͸� ��ü ���(�͸� ��ü �ʵ� ���)
		anony.field.wake();
		//2. �޼ҵ�(��������)�� �͸�ü ���(�͸� ��ü ���ú��� ���)
		System.out.println("----anony.method1();----");
		anony.method1();
		//3. �Ű������� �͸�ü ��� (�̿ܿ��� �� ������, ������������ �̰ͱ����� �ٷ�, �͸� ��ü �Ű��� ���)
		System.out.println("----anony.method2();----");
		anony.method2(
				new Person() {
					void study() {
						System.out.println("�����մϴ�.");
					}
					@Override
					public void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
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
		S.C c = new S.C();	//S ��ü ������ �ʿ���� �ٷ� ������ �� �ִ�.

		c.field3 = 3;		//�ν��Ͻ� �ʵ� ���
//		S.C.field3 = 3;
		S.C.field4 = 5;		//���� �ʵ� ���
		c.method3();		//�ν��Ͻ� �޼ҵ� ���
		S.C.method4();		//���� �޼ҵ� ���
	}

	public static void nesting() {
		DD dd = new DD();

		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		DD.BB bb = dd.new BB();
		bb.field5 = 5;
		bb.method5();

		//���� ��� Ŭ���� ��ü ����
		DD.CC cc = new DD.CC();
		cc.field7 = 7;
		DD.CC.field8 = 8;
		cc.method7();
		DD.CC.method8();

		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		dd.methodE();
	}
}
