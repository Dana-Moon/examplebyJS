package example_0706.dana;

public class StrawberryJelly implements Choose,Eating {
    private static String strawberry = "딸기";
    public void choice(String human) {
        System.out.println(human+"이(가) "+strawberry+" 젤리를 골랐네요.");
    }
    public void eat(String human) {
        System.out.println(human+"이(가) "+strawberry+" 젤리를 먹습니다.");
    }
}
