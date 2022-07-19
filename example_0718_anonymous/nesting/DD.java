package example_0718_anonymous.nesting;
/*바깥 클래스*/
public class DD {
    public DD() {
        System.out.println("A 객체가 생성됨.");
    }

    /*인스턴스 멤버 클래스*/
    public class BB{
        public BB() {
            System.out.println("B 객체가 생성됨.");
        }
        public int field5;
        //static int field6;
        public void method5() {
            System.out.println("BB의 method5임.");
        }
        //static void method6() {}
    }

    /*정적 멤버 클래스*/
    public static class CC {
        public CC() {
            System.out.println("C 객체가 생성됨.");
        }
        public int field7;
        public static int field8;
        public void method7() {
            System.out.println("CC의 method7임.");
        }
        public static void method8() {
            System.out.println("CC의 method8임.");
        }
    }

    public void methodE() {
        /*로컬 클래스*/
        class F {
            F() {
                System.out.println("D 객체가 생성됨.");
            }
            int field9;
            //static int field10;
            void method9() {
                System.out.println("F의 method9임.");
            }
            //static void method10() {}
        }
        F f = new F();
        f.field9 = 3;
        f.method9();
    }
}
