package example_0701_multi_implement.joonseok;

public class LeeJS extends JoonSeok {
    private String name = "이";
    private int sec = 11;

    LeeJS(String name, int sec) {
        super("이", 11);
    }

    public void changeCh(String name, int sec) {
        System.out.println("----------------");
        System.out.println(name + "이 채널을 바꿉니다.");
        System.out.println(name +"의 "+sec+"초가 흐릅니다.");
        System.out.println("----------------");
    }
}
