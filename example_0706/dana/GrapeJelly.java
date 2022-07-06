package example_0706.dana;

public class GrapeJelly implements Choose,Eating {
    private static String grape = "포도";
    public void choice(String human) {
        System.out.println(human+"이(가) "+grape+" 젤리를 골랐네요.");
    }
    public void eat(String human) {
        System.out.println(human+"이(가) "+grape+" 젤리를 먹습니다.");
    }
}
