package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student(); // 객체 혹은 인스턴스 실제 메모리에 만들어진 실체이다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 객체 혹은 인스턴스 실제 메모리에 만들어진 실체이다.
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 80;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println(student1); // 참조값을 확인하고 싶을때는 다음과 같이 객체를 담고 있는 변수를 출력.
        System.out.println(student2); // 패키지 + 클래스 정보 @ 참조값이 출력된다.
        System.out.println(student3);

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
        System.out.println("이름:" + students[2].name + " 나이:" + students[2].age + " 성적:" + students[2].grade);


    }
}
