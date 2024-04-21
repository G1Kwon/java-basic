package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //인스턴스 변수 접근, compile error
        //instanceValue++;
        //인스턴스 메서드 접근, compile error
        //instanceMethod();
        
        //정적 변수 접근
        staticValue++;
        //정적 메서드 접근
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        //외부에서 넘겨준 참조값을 사용한 것이지 직접 접근한 것이 아니다.
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        //인스턴스 변수 접근
        instanceValue++;
        //인스턴스 메서드 접근
        instanceMethod();

        //정적 변수 접근
        staticValue++;
        //정적 메서드 접근
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
