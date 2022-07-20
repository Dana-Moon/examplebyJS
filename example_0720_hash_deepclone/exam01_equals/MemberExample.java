package example_0720_hash_deepclone.exam01_equals;

public class MemberExample {
	//String[] �迭�� OS(������)���� �ʱ⿡ �����͸� �޴� �Ա�
	//static : ���α׷����� �� 1��, �ν��Ͻ� �� ����.
	public static void main(String[] args) {
		student();

	}

	public static void redBlue() {
		//�ν��Ͻ� ����
		//���� �κ� : Member Ÿ������ obj1 ���������� ����
		// = : ���� ������ (������ �ִ� �ν��Ͻ��� ������ �ִ� ���� �κп� �Ҵ�(����))
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");

		Member obj3 = new Member("red");

		//obj��� ��ü�� 3���� �Ҵ�� ��Ȳ(�ּҰ�)

		//equals �޼��带 �Ἥ ���� Ÿ�� ��
		//�⺻ Ÿ�Գ��� ���� ���� == ���
		//�����ǵ� equals ���
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}

		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}

		//����, obj3�� �Ҵ�� �ν��Ͻ� ��ſ� obj2�� �ν��Ͻ��� ����Ǿ
		//���� �ִ� obj3�� �Ҵ�� �ν��Ͻ��� ���� ������.(������ �÷��Ͱ� ã�Ƽ� ȸ��)
		//������ �ּ� ����.
		obj3 = obj2;
		if(obj2.equals(obj3)) {
			System.out.println("obj2�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj2�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

	public static void student() {
		EqualsStudent student_1 = new EqualsStudent(1, "���ؼ�");
		EqualsStudent student_2 = new EqualsStudent(2, "���ؼ�");

		if(student_1.equals(student_2)) {
			System.out.println(student_1.getName()+"��(��) "+student_2.getName()+"��(��) �����ι��Դϴ�.");
		} else {
			System.out.println("�����ι��� �ƴմϴ�.");
		}

		student_2.setTeamNumber(1);

		if(student_1.equals(student_2)) {
			System.out.println(student_1.getName()+"��(��) "+student_2.getName()+"��(��) �����ι��Դϴ�.");
		} else {
			System.out.println("�����ι��� �ƴմϴ�.");
		}

		student_2.setName("���ؼ�");
		if(student_1.equals(student_2)) {
			System.out.println(student_1.getName()+"��(��) "+student_2.getName()+"��(��) �����ι��Դϴ�.");
		} else {
			System.out.println("�����ι��� �ƴմϴ�.");
		}
	}
}
