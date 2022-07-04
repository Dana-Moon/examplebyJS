package example_0701_multi_implement.joonseok;

public class KimJS extends JoonSeok {
    KimJS(String name, int sec) {
        super("김", 5);
    }

    public void changeCh(String name, int sec) {
        System.out.println("----------------");
        System.out.println(name + "이 채널을 바꿉니다.");
        System.out.println(name +"의 "+sec+"초가 흐릅니다.");
        System.out.println("----------------");
    }
}
