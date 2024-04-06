package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        //name 은 지역변수가 아닌 멤버 변수를 사용
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
