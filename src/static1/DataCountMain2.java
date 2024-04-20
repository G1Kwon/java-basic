package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        //Data2 클래스와 관련된 일인데 Counter라는 별도의 클래스를 추가로 사용해야 한다.
        //생성자의 매개변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count= " + counter.count);

        Data2 data2 = new Data2("A", counter);
        System.out.println("A count= " + counter.count);

        Data2 data3 = new Data2("A", counter);
        System.out.println("A count= " + counter.count);
    }
}
