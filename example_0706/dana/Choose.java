package example_0706.dana;

public interface Choose {
    void choice(String human);

    default void defaultmethod_jelly_choice(Choose jelly) {
        if(jelly instanceof MangoJelly) {
            System.out.println("망고젤리를 골랐군요!!");
        }else if(jelly instanceof GrapeJelly) {
            System.out.println("포도젤리를 골랐군요!!");
        }else if(jelly instanceof StrawberryJelly) {
            System.out.println("딸기젤리를 골랐군요!!");
        }
    }
}