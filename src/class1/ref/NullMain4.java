package class1.ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        //멤버변수에 참조값을 할당하였기에 NPE가 발생하지 않았다.
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
