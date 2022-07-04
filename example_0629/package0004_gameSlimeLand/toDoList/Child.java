package example_0629.package0004_gameSlimeLand.toDoList;

public class Child extends Parent{
    String bagname;
    int cost;

    public Child(String input_bagName, int input_money) {
        super(input_bagName, input_money);
    }
    
    @Override
    public void goToWork() {
        System.out.println("학생은 등교합니다.");
    }

    public void goToPCRoom() {
        System.out.println("학생은 피시방에 놀러갑니다.");
    }
}
