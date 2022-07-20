package example_0720_hash_deepclone.exam01_equals;

public class EqualsStudent {
    //getter, setter 쓰는 이유 : 객체의 캡슐화, 데이터 입출력이라는 기능의 메서드를 잘 쓰기 위해서
    //오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
    //기본적으로 생성자(매개변수 없는) 1개는 있다.
    private int teamNumber;
    private String name;

    public EqualsStudent(int input_teamNumber, String input_name) {
        this.teamNumber = input_teamNumber;
        this.name = input_name;
    }

    //외부에서 필드값을 바로 조회 또는 수정을 막기 위해서! 객체는 딱 닫혀야 합니다.
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
        //instanceof : 메모리 heap에 있는 인스턴스끼리 비교하는 것.
        //상속 받았다면 부모 클래스로 동일하다고 true가 나온다.
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
