package example_0701_multi_implement.joonseok;

import example_0701_multi_implement.RemoteControl.SmartTelevision;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public abstract class JoonSeok {
    private static int time = 0;
    private static int i = 0;

    private static final int[] CHANNEL = {10, 20, 30, 40, 50};

    private static HashMap<String, Integer> NAMES = new HashMap<>();
    private static ArrayList<Integer> Time = new ArrayList<>();
    private static SmartTelevision TV = new SmartTelevision();
    
    public JoonSeok(String name, int sec) {
        NAMES.put(name, sec);
        Time.add(sec);
    }

    public static void changeCh(String name, int sec) {
        System.out.println("----------------");
        System.out.println(name +"이 채널을 바꿉니다.");
        System.out.println(name +"의 "+sec+"초가 흐릅니다.");
        System.out.println("----------------");
    }

    public static void ChangeChannel() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        time = 2;
            for (i = 0; i < CHANNEL.length; i++) {
                if (time % 3 == 0) {
                    JoonSeok.changeCh("박", 3);
                    System.out.println("바뀐 채널: " + CHANNEL[i]);
                }
                if (time % 5 == 0) {
                    JoonSeok.changeCh("김", 5);
                    System.out.println("바뀐 채널: " + CHANNEL[i]);
                }
                if (time % 11 == 0) {
                    JoonSeok.changeCh("이", 11);
                    System.out.println("바뀐 채널: " + CHANNEL[i]);
                }
                TimeUnit.SECONDS.sleep(1);
                time++;
                if (i == 4) {
                    i = 0;
                }
            }
    }

    public static void ChangeInguk() throws InterruptedException {
        while(true) {
            Time.forEach(sec -> {
                if(time%sec == 0) {
                    System.out.println(NAMES.get(sec) + "/ " + sec+"초/ "+ time);
                    TV.search(String.valueOf(CHANNEL[time%CHANNEL.length]));
                }
            });
            TimeUnit.SECONDS.sleep(1);
            time++;
        }
    }
}

