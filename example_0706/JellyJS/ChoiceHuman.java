package example_0706.JellyJS;

public class ChoiceHuman implements eat {
    //사람의 이름을 받는 필드
    private String name;
    private String jellyName;

    //사람을 매개변수로
    ChoiceHuman() {
        this.name = "알 수 없음";
    }

    ChoiceHuman(String input_name, String input_jelly) {
        this.name = input_name;
        this.jellyName = input_jelly;
    }

    public void eat(String action) {
        System.out.println(this.name + "이(가) " + jellyName + "을 " + action);
    }
}
