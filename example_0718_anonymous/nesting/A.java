package example_0718_anonymous.nesting;

public class A {
    /*�ν��Ͻ� ��� Ŭ����*/
    public class B {
        public B() { }         //������
        public int field1;     //�ν��Ͻ� �ʵ�
        //public static int field2;    //���� �ʵ�(x)
        public void method1() { }      //�ν��Ͻ� �޼ҵ�
        //public static void method2() { }     //���� �޼ҵ�(x)
    }
}
