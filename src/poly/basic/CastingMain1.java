package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호추 할 수 없다. compile error

        //다운캐스팅(부모 타입 -> 자식 타입)
        //캐스팅을 한다고 해서 Parent poly 타입이 변하는 것은 아니다.
        //해당 참조값을 꺼내고 꺼낸 참조값이 Child 타입이 되는 것이다.
        Child child = (Child) poly;
        //Child child = (Child) poly 다운캐스팅을 통해 부모타입을 자식 타입으로 변환한 다음에 대입 시도
        //Child child = (Child) x001 참조값을 읽은 다음 자식 타입으로 지정
        //Child child = x001 최종결과
        child.childMethod();
    }
}
