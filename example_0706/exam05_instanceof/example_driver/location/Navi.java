package example_0706.exam05_instanceof.example_driver.location;

public interface Navi {
    void location();

    default void drive(Navi navi) {
        if(navi instanceof Cheonan) {
            Cheonan cheonan = (Cheonan) navi;
            cheonan.location();
        }
        if(navi instanceof CheonanTG) {
            CheonanTG cheonanTG = (CheonanTG) navi;
            cheonanTG.location();
        }
        if(navi instanceof Expressway) {
            Expressway exway = (Expressway) navi;
            exway.location();
        }
        if(navi instanceof Seoul) {
            Seoul seoul = (Seoul) navi;
            seoul.location();
        }
    }
}
