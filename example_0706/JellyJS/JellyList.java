package example_0706.JellyJS;

public interface JellyList {
    String[] JellyList = {"mango", "grape", "strawberry"};

    static String[] viewJellyList() {
        for(int i = 0; i>JellyList.length; i++) {
            System.out.println("젤리 목록을 출력합니다.");
            System.out.println(i+"번째 젤리는"+JellyList[i]+"입니다.");
        }
//        for(String a : JellyList) {
//            System.out.println("젤리 목록을 출력합니다.");
//        }
        return JellyList;
    }
}

