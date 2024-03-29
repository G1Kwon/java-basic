package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA = " + dataA);
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changePrimitive(dataA);
        System.out.println("메서드 호출 후: dataA = " + dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    private static void changePrimitive(Data dataX) {
        //int x = dataA 로 해석해야한다.
        System.out.println("dataX=" + dataX);
        dataX.value = 20;
    }

}
