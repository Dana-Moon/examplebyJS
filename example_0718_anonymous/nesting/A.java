package example_0718_anonymous.nesting;

public class A {
    /*인스턴스 멤버 클래스*/
    public class B {
        public B() { }         //생성자
        public int field1;     //인스턴스 필드
        //public static int field2;    //정적 필드(x)
        public void method1() { }      //인스턴스 메소드
        //public static void method2() { }     //정적 메소드(x)
    }
}
