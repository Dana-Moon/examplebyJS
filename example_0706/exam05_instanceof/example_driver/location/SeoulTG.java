package example_0706.exam05_instanceof.example_driver.location;

public class SeoulTG implements Navi, InOutTG{
    private String location = "서울";

    public void location() {
        System.out.println("차는 현재 "+this.location+" 톨게이트를 지나고 있습니다.");
//        System.out.println(speed+"km 미만의 속도를 유지합니다.");
    }
    public void InTG() {
        System.out.println("차는 "+this.location+" 톨게이트를 통해 시내로 들어가려 합니다.");
    }

    public void OutTG() {
        System.out.println("차는 "+this.location+" 톨게이트를 통해 고속도로로 진입하려 합니다.");
    }
}
