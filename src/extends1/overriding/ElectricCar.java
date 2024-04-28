package extends1.overriding;

public class ElectricCar extends Car {

    //컴파일러는 이 애노테이션을 보고 메서드가 정확히 오버라이드 되었는지 확인한다.
    //오버라이딩 조건을 만족시키지 않으면 컴파일 에러를 발생한다.
    //필수는 아니지만 코드의 명확성을 위해 붙여주는 것이 좋다.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
