package example_0706.exam05_instanceof.example_bus;

public interface Hipass extends payment {
    default void payHI(String car_name) {
        System.out.println(car_name+" 운전자가 하이패스로 요금을 냅니다.");
    }
}
