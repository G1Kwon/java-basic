package poly.overriding;

public class Child extends Parent{

    public String value = "child";

    //오버라이딩 된 메서드는 항상 우선권을 가진다.
    //오버라이딩은 부모 타입에서 정의한 기능을 자식 타입에서 재정의하는 것이다.
    //만약 자식에서도 오버라이딩 하고 손자에서도 같은 메서드를 오버라이딩을 하면 손자의 오버라이딩 메서드가 우선권을 가진다.
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
