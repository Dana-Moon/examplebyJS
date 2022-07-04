package example_0629.package0004_gameSlimeLand.toDoList;

public class Parent {

    public String bagName;
    public int money;

    public Parent(String input_bagName, int input_money) {
        this.bagName = input_bagName;
        this.money = input_money;
    }

    public void goToWork() {
        System.out.println("부모님은 회사로 출근합니다.");
    }
}
