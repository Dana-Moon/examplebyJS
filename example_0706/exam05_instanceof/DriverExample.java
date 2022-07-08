package example_0706.exam05_instanceof;

import example_0706.exam05_instanceof.example_bus.*;
import example_0706.exam05_instanceof.example_driver.driver.*;
import example_0706.exam05_instanceof.example_driver.location.*;

public class DriverExample {
	public static void main(String[] args) {
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

		DriverName driverName = new Newby();
		driverName.speed("정은");
		Cheonan cheonan = new Cheonan();
		cheonan.drive(cheonan);

		System.out.println("____________________");

		CheonanTG cheonanTG = new CheonanTG();
		cheonanTG.drive(cheonanTG);

		System.out.println("____________________");







		//추상 클래스와 인터페이스를 왜 쓰는지, 어떤 경우에 쓰는지 고민
	}
}
