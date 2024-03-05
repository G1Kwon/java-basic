package class1;

public class ClassStart5 {
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

        Student[] students = new Student[] {student1, student2, student3};

        System.out.println(student1); // 참조값을 확인하고 싶을때는 다음과 같이 객체를 담고 있는 변수를 출력.
        System.out.println(student2); // 패키지 + 클래스 정보 @ 참조값이 출력된다.
        System.out.println(student3);

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
