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

//            String[] applicant = {"�����", "������", "������", "������", "A", "B", "C"};

            String applicant1 = team_part_front[0];
            String applicant2 = team_part_front[1];
            String applicant3 = team_part_front[2];

            System.out.println("1�� �����ڴ� " + applicant1 + "�̴�.");
            System.out.println("2�� �����ڴ� " + applicant2 + "�̴�.");
            System.out.println("3�� �����ڴ� " + applicant3 + "�̴�.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("__ArrayIndexOutOfBoundsException ������ �߻��߽��ϴ�.__");
            System.out.println("�����ڰ� �������� �����ϴ�.");
            e.printStackTrace();
        } finally {
            System.out.println("������ �����Ǿ����ϴ�.");
        }
    }
}
