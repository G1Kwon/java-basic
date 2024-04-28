package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count= " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count= " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("B count= " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        //권장하지 않는다. 성능의 문제가 아니라 count가 인스턴스 변수인가 코드를 보고 구별이 어렵기 때문이다.
        //IDE 도 static 멤버 'static1.Data3.count'이(가) 인스턴스 참조를 통해 액세스됩니다 로 경고를 한다.
        Data3 data4 = new Data3("D");
        System.out.println("D count= " + data4.count);

        //클래스를 통한 접근
        //
        System.out.println("D count= " + Data3.count);
    }
}
