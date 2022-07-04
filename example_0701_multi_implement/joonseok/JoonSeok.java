package example_0701_multi_implement.joonseok;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class JoonSeok {
    private int time = 0;
    private static final int[] CHANNEL = {10, 20, 30, 40, 50};
    private static ArrayList<Integer> Time = new ArrayList<>();
    
    public JoonSeok(String name, int sec) {
        
    }

    

    void ChangeChannel() throws InterruptedException {
        while(true) {
            if (time%sec == 0) {
                System.out.println("");
            }
            TimeUnit.SECONDS.sleep(1);
            time++;
            break;
        }
        
    }
}
