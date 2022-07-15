package example_0713_exception;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //트랙잭션
        boolean checkTrue = false;
        String[] gameProcess = {"성공", "성공", "실패", "성공", "헤이즐넛"};
        ArrayList<String> savePoint = new ArrayList<>();
        int SuccessCountSave = 0;

        try {
            for(String success : gameProcess) {
                if (success.equals("성공")) {
                    System.out.println("1 -- 성공 하였습니다.");
                    savePoint.add(success);
                    SuccessCountSave++;
                } else if(success.equals("실패")) {
                    throw new Exception("2 -- 실패 하였습니다.");
                } else {
                    System.out.println("오류 입니다.");
                    throw new Exception("3 -- 알 수 없는 오류입니다.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            checkTrue = true;
            System.out.println("checkTrue : " + checkTrue);
            //언두가 존재해야 함.
            //원래 상태와 차이점을 찾아서 돌아간다.
        } finally {
            System.out.println("다음 처리된 프로세스를 출력합니다.");
            for (String saveContent : savePoint) {
                System.out.println(saveContent);
                //로그 기록
            }
        }
    }
}
