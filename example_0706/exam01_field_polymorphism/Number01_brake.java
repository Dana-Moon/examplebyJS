package example_0706.exam01_field_polymorphism;

public class Number01_brake implements Pedal, Brake{
    public void push() {
        System.out.println("페달을 밟습니다.");
    }

    public  void stop() {
        System.out.println("브레이크로 멈춥니다.");
    }
}
