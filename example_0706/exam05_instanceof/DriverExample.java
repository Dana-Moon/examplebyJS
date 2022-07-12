package example_0706.exam05_instanceof;

import example_0706.exam05_instanceof.example_bus.*;
import example_0706.exam05_instanceof.example_driver.driver.*;
import example_0706.exam05_instanceof.example_driver.location.*;

public class DriverExample {
	public static void main(String[] args) {
//		DriverName M = new Newby();
//		DriverName a1 = new Master();
//		DriverName a2 = new Expert();
//		DriverName a3 = new Newby();
//
//		instanceOfMethod(M, a1, a2, a3);

		Question02();


	}

	private static void exampleJS() {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus, "학생");
		driver.drive(taxi, "직장인");
	}

	private static void Question01() {

		//버스와 택시에 인터페이스를 추가(인터페이스의 다양성 추가해서, 기능 강제성 구현)
		//1. 요금 납부 인터페이스, 하이패스 인터페이스를 구현.
		//하이패스는 요금 납부를 상속받습니다.
		//버스는 하이패스를 쓰지 않습니다.(이것을 고민해보기)

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		bus.checkFare("학생");
		bus.pay("학생");
//		bus.payHI();
		taxi.pay("대학생");
		taxi.payHI("택시");
	}

	private static void Question02(){

		//형변환(객체 상속과 형변환을 통해 유연한 객체활용)
		//2. 초보자는 속도를 30km 이하로 달리고, 숙련자는 60km 미만, 전문가는 100km 이상으로 달립니다.
		//드라이버A는 천안, 서울과 같은 도시 내에서는 초보차처럼 달리고, 고속도로에서는 전문가처럼 달립니다.
		//(기본) 형변환을 통해 System.out.println 문구를 출력하면서 천안에서 고속도로 타고 서울까지 달리는 드라이버 클래스를 만드시오.
		//ex)천안 > 천안톨게이트 > 고속도로 > 서울이라는 위치 또는 지역을 가르키는 변수와
		//객체를 활용하여 달리는 속도를 출력하는 System.out.print를 활용하여 문구를 출력하시면 된다.

		// (객체)형변환을 하는 이유 : 뎁스를 만들기 위해(카테고리가 좌우관계라면, 뎁스는 상하관계라고 한다.)
		//get 활용하기, instanceof, isinstanceof(인스턴스 자체 비교, 인스턴스를 만들어서 해야해서, 메모리적 손해 있다. 싱글톤이나 그밖의 것 생각해볼것)
		//istanceof 인스턴스 비교(부모클래스는 true)
		//클래스의 이름 비교를 통해 클래스 비교


		DriverName driverName = new Newby();
		driverName.speed("정은","천안");
		Navi cheonan = new Cheonan();
		cheonan.loca(cheonan);

		System.out.println("____________________");

		InOutTG cheonanTG = new CheonanTG();
		cheonanTG.OutTG();
		cheonan = new CheonanTG();
		cheonan.loca(cheonan);
		driverName.speed("정은", "천안 톨게이트");

		System.out.println("____________________");



		//추상 클래스와 인터페이스를 왜 쓰는지, 어떤 경우에 쓰는지 고민
	}

	private static void instanceOfMethod(DriverName M, DriverName a1, DriverName a2, DriverName a3) {
		//[1]클래스의 이름 비교를 통해 클래스 비교
		System.out.println(M.getClass().getName().equals("soyeon.Master"));
		System.out.println(a1.getClass().getName());
		System.out.println(a2.getClass().getName());
		System.out.println(a3.getClass().getName());


		//[2]인스턴스 자체와 비교를 통해 구분
		if(M.getClass().isInstance(a1)) {
			System.out.println("마스터 비교");
		}else if(M.getClass().isInstance(a2)) {
			System.out.println("숙련자 비교");
		}else if (M.getClass().isInstance(a3)) {
			System.out.println("초보자 비교");
		}

		//[3]인스턴스의 핏줄까지 전부 비교
		System.out.println(M.getClass().getName());
		if(M instanceof Master) {
			System.out.println("1번");
		} else if(M instanceof Expert) {
			System.out.println("2번");
		} else if(M instanceof Newby) {
			System.out.println("3번");
		}
	}
}
