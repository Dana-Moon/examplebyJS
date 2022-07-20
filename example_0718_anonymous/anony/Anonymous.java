package example_0718_anonymous.anony;

public class Anonymous{
	//필드로 익명객체 사용법
	//필드 초기값으로 대입
//	Person field = new Person() {
//		int fieldInt;
//		void work() {
//			System.out.println("출근합니다?");
//		}
//		@Override
//		void wake() {
//			fieldInt = 40;
//			System.out.println("_first_ 6시에 일어납니다.");
//			work();
//		}
//	};

	public Person field = new Person() {
		int fieldInt;

		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		public void wake() {
			fieldInt = 9;
			System.out.println("6시에 일어납니다.");
			System.out.println(fieldInt + "까지 출근해야 합니다.");
		}
//		@Override
//		public void run() {
//			System.out.println("달립니다.");
//		}
	};
	
	public void method1() {
		//로컬변수값으로 대입(지역변수) method 안에 익명객체 생성할 수 있다.
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			public void wake() {
				System.out.println("7시에 일어납니다.");
				work();
			}

			private void work() {
				System.out.println("일하러 갑니다.");
			}
		};
		//로컬변수 사용
		localVar.wake();
	}
	
	public void method2(Person person) {
		person.wake();
	}



}











