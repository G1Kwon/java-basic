package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능;
        //data1 = 20; //compile error

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //compile error

    }

    static void method(final int parameter) {
        //compile error
        //parameter = 20;
    }
}
