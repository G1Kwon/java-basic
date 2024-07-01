package poly.ex6;

//extends를 통한 상속은 하나만 할 수 있고 implements를 통한 인터페이스는 다중 구현을 할 수 있기 때문에
//둘이 함꼐 나온 경우 extends가 먼저 나와야 한다.
public class Birds extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Birds sound");
    }

    @Override
    public void fly() {
        System.out.println("Birds fly");
    }
}
