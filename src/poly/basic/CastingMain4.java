package poly.basic;

//다운캐스팅을 자동을 하지 않은 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        //부모 타입으로 객체를 생성한다. 따라서 메모리 상에 자식 타입은 전혀 존재하지 않는다.
        //생성 결과를 parent2 에 담아둔다. 이경우 같은 타입이니 문제가 발생하지 않는다.
        Parent parent2 = new Parent();
        //Runtime error ClassCastException
        //parent2는 Parent 로 생성이 되었다. 따라서 메모리 상에 Child 자체가 존재하지 않는다.
        //Child 자체를 사용할 수 없는 것이고 이럴째는 자바에서는 ClassCastException 이라는 예외를 발생시킨다.
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}
