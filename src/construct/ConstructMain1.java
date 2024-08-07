package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 메서드를 직접 한번 더 호출해야했다.
        //생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.
        //생성자를 사용하면 필수값 입력을 보장할 수 있다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: "+ member.age + " 성적: " + member.grade);
        }
    }
}
