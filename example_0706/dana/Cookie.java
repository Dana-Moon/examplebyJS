package example_0706.dana;

public class Cookie implements Choose,Eating {
    private static String cookie = "쿠키";

    public void choice(String human) {
        System.out.println(human+"이(가) "+cookie+"를 골랐어요.");
    }

    public void eat(String human) {
        System.out.println(human+"이(가) "+cookie+"를 골랐어요.");
    }
}
