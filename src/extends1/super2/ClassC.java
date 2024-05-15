package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        //생성자는 하나만 호출할 수 있다.
        //생성자를 부모 클래스에서 정의했기에 기본생성자가 아니고 직접 정의해야한다.
        super(10, 20);
        System.out.println("ClassC constructor");
    }
}
