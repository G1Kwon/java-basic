package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello World";
        //DecoUtil2.deco 는 static 메서드이ㅣㄱ에 정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해 바로 호출 할 수 있다.
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
