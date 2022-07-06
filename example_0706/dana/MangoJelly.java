package example_0706.dana;

public class MangoJelly implements Choose,Eating {
    private static String mango = "망고";
    public void choice(String human) {
        System.out.println(human+"이(가) "+mango+" 젤리를 골랐네요.");
    }
    public void eat(String human) {
        System.out.println(human+"이(가) "+mango+" 젤리를 먹습니다.");
    }
}
