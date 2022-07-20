package example_0720_hash_deepclone.exam01_equals;

public class EqualsStudent {
    //getter, setter ���� ���� : ��ü�� ĸ��ȭ, ������ ������̶�� ����� �޼��带 �� ���� ���ؼ�
    //�����ε�(Ŭ������ ��Ÿ��) : �������� �Ű������� ���� �پ��� Ÿ������ ����
    //�⺻������ ������(�Ű����� ����) 1���� �ִ�.
    private int teamNumber;
    private String name;

    public EqualsStudent(int input_teamNumber, String input_name) {
        this.teamNumber = input_teamNumber;
        this.name = input_name;
    }

    //�ܺο��� �ʵ尪�� �ٷ� ��ȸ �Ǵ� ������ ���� ���ؼ�! ��ü�� �� ������ �մϴ�.
    public int getTeamNumber() {
        return teamNumber;
    }

    public String getName() {
        return name;
    }

    public void setTeamNumber(int input_teamNumber) {
        this.teamNumber = input_teamNumber;
    }

    public void setName(String input_name) {
        this.name = input_name;
    }

    @Override
    public boolean equals(Object obj) {
        //instanceof : �޸� heap�� �ִ� �ν��Ͻ����� ���ϴ� ��.
        //��� �޾Ҵٸ� �θ� Ŭ������ �����ϴٰ� true�� ���´�.
        if(obj instanceof EqualsStudent) {
            EqualsStudent student = (EqualsStudent) obj;
//            if(name.equals(student.getName())) {
//                if (teamNumber == student.getTeamNumber()) {
//                    return true;
//                }
//            }
            if(name.equals(student.getName()) && teamNumber == student.getTeamNumber()) {
                return true;
            }
        }
        return false;
    }
}
