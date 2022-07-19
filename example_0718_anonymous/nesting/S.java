package example_0718_anonymous.nesting;

public class S {
    /*정적 멤버 클래스*/
    public static class C {
        public C() { }         //생성자
        public int field3;     //인스턴스 필드
        public static int field4;      //정적 필드
        public void method3() { }      //인스턴스 메소드
        public static void method4() { }       //정적 메소드
    }
}
