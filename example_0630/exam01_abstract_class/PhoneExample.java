package example_0630.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		abstract01();
	}

	private static void abstract01() {

        // 형변환을 했을 때, 추상 클래스도 쓸 수 있나?
        
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

        Phone Phone = (Phone) smartPhone;

        Phone.turnOn();
        // Phone.internetSearch();
        Phone.turnOff();
    
    }
}
