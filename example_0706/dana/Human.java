package example_0706.dana;

public class Human {
    public static Choose mangojelly = new MangoJelly();
    public static MangoJelly mango = new MangoJelly();
    public static Choose grapejelly = new GrapeJelly();
    public static Choose strawberryjelly = new StrawberryJelly();

    public static Eating mangojelly2 = new MangoJelly();
    public static Eating grapejelly2 = new GrapeJelly();
    public static Eating strawberryjelly2 = new StrawberryJelly();

    public static Choose jelly01 = new MangoJelly();

    public  static Cookie cookie = new Cookie();
    public static Cookie cookie2 = new Cookie();

    public static String[] Human = {"사람A", "사람B", "사람C"};

    public static void HumanJelly() {
        mangojelly.choice(Human[0]);
        mangojelly2.eat(Human[0]);
        mango.choice(Human[0]);
        grapejelly.choice(Human[1]);
        grapejelly2.eat(Human[1]);
        strawberryjelly.choice(Human[2]);
        strawberryjelly2.eat(Human[2]);

        System.out.println("__________test1__________");

        cookie.choice(Human[0]);
        cookie2.eat(Human[0]);

        System.out.println("__________test2__________");

        jelly01.defaultmethod_jelly_choice(mangojelly);
        jelly01 = new GrapeJelly();
        jelly01.defaultmethod_jelly_choice(jelly01);
        jelly01 = new StrawberryJelly();
        jelly01.defaultmethod_jelly_choice(jelly01);
    }
}
