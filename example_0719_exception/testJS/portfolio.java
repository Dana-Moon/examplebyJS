package example_0719_exception.testJS;

public class portfolio {
    public static void main(String[] args) {
        Question01();


    }

    public  static void Question01(){
        try {
            String[] team_part_front = {"front1", "front2"};
            String[] team_part_back = {"back1", "back2"};
            String[] DB = {"DB"};
            String[] PM = {"PM"};

//            String[] applicant = {"김명훈", "문정은", "정명훈", "이진실", "A", "B", "C"};

            String applicant1 = team_part_front[0];
            String applicant2 = team_part_front[1];
            String applicant3 = team_part_front[2];

            System.out.println("1번 지원자는 " + applicant1 + "이다.");
            System.out.println("2번 지원자는 " + applicant2 + "이다.");
            System.out.println("3번 지원자는 " + applicant3 + "이다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("__ArrayIndexOutOfBoundsException 오류가 발생했습니다.__");
            System.out.println("지원자가 정원보다 많습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("지원이 마감되었습니다.");
        }
    }
}
