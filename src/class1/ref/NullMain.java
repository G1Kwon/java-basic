package class1.ref;

public class NullMain {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); //Data 객체를 생성해서 그 참조값을 data에 할당.참조할 객체가 존재한다는 것.
        System.out.println("2. data = " + data);
        data = null; //이렇게 하면 앞서 만든 Data 인스턴스를 더이상 참조하지 않는다
        System.out.println("3. data = " + data);

    }
}
