package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참고 (다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출 할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        //캐스팅을 한다고 해서 Parent poly 타입이 변하는 것은 아니다.
        //해당 참조값을 꺼내고 꺼낸 참조값이 Child 타입이 되는 것이다.
        Child child = (Child) poly;
        //Child child = (Child) poly 다운캐스팅을 통해 부모타입을 자식 타입으로 변환한 다음에 대입 시도
        //Child child = (Child) x001 참조값을 읽은 다음 자식 타입으로 지정
        //Child child = x001 최종결과
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        //Parent 타입을 임시로 Child로 변경한다. 그리고 메서드를 호출할 때 Child 타입에서 찾아서 실행한다.

        //정확하게는 poly 가 Child 타입으로 바뀌는 것이 아니다.
        //해당 참조값을 꺼내고 참조값이 Child 타입이 되는 것이다.
        //poly 의 타입은 Parent 로 그대로 유지된다.
        ((Child) poly).childMethod();

        //이렇게 일시적 다운캐스팅을 사용하면 별도의 변수 없이 인스턴스의 자식 타입의 기능을 사용할 수 있다.
    }
}
