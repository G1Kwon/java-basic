package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        //super(); //기본 생성자 생략 가능
        //생성자 첫줄에 this 를 사용할 수는 있다 하지만 super는 자식 생성자 안에서 언젠가는 반드시 호출해야한다 안하면 compile error
        this(a, 0);
        System.out.println("ClassB constructor = " + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB constructor = " + a + ", b = " + b);
    }
}
