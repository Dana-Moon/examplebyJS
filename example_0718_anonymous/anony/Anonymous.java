package example_0718_anonymous.anony;

public class Anonymous{
	//�ʵ�� �͸�ü ����
	//�ʵ� �ʱⰪ���� ����
//	Person field = new Person() {
//		int fieldInt;
//		void work() {
//			System.out.println("����մϴ�?");
//		}
//		@Override
//		void wake() {
//			fieldInt = 40;
//			System.out.println("_first_ 6�ÿ� �Ͼ�ϴ�.");
//			work();
//		}
//	};

	public Person field = new Person() {
		int fieldInt;

		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		public void wake() {
			fieldInt = 9;
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			System.out.println(fieldInt + "���� ����ؾ� �մϴ�.");
		}
//		@Override
//		public void run() {
//			System.out.println("�޸��ϴ�.");
//		}
	};
	
	public void method1() {
		//���ú��������� ����(��������) method �ȿ� �͸�ü ������ �� �ִ�.
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			public void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				work();
			}

			private void work() {
				System.out.println("���Ϸ� ���ϴ�.");
			}
		};
		//���ú��� ���
		localVar.wake();
	}
	
	public void method2(Person person) {
		person.wake();
	}



}











