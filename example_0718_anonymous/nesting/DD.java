package example_0718_anonymous.nesting;
/*�ٱ� Ŭ����*/
public class DD {
    public DD() {
        System.out.println("A ��ü�� ������.");
    }

    /*�ν��Ͻ� ��� Ŭ����*/
    public class BB{
        public BB() {
            System.out.println("B ��ü�� ������.");
        }
        public int field5;
        //static int field6;
        public void method5() {
            System.out.println("BB�� method5��.");
        }
        //static void method6() {}
    }

    /*���� ��� Ŭ����*/
    public static class CC {
        public CC() {
            System.out.println("C ��ü�� ������.");
        }
        public int field7;
        public static int field8;
        public void method7() {
            System.out.println("CC�� method7��.");
        }
        public static void method8() {
            System.out.println("CC�� method8��.");
        }
    }

    public void methodE() {
        /*���� Ŭ����*/
        class F {
            F() {
                System.out.println("D ��ü�� ������.");
            }
            int field9;
            //static int field10;
            void method9() {
                System.out.println("F�� method9��.");
            }
            //static void method10() {}
        }
        F f = new F();
        f.field9 = 3;
        f.method9();
    }
}
