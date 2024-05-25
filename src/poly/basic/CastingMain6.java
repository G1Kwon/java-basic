package poly.basic;

//JAVA 16
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call (Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        //JAVA 16 부터 instanceof 를 사용하면서 동시에 변수를 선언할 수 있다.
        //덕분에 인스턴스가 맞는 경우 직접 다운캐스팅하는 코드 생략 할 수 있다.
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
