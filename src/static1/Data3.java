package static1;

public class Data3 {
    //멤버 변수 중의 인스턴스 변수 이다 : static이 붙지 않은 멤버 변수
    public String name;
    //멤버 변수 중의 클래스 변수이다. : static이 붙은 멤버 변수
    //static 변수는 클래스인 붕어빵 틀이 특별히 관리하는 변수이다.
    //붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재한다.
    //하지만 인스턴스인 붕어빵은 인스턴스의 수만큼 변수가 존재한다.
    //static 변수를 사용하면 공용변수처럼 사용할 수 있다.
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
