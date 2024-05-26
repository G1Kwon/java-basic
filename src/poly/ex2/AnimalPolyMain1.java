package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    //다형성을 사용하기 위해 새로운 동물은 Animal 을 상속 받아야 한다.
    //Animal animal = dog .. 같이 부모는 자식을 담을 수 있다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        //animal 변수의 타입은 Animal 이다.
        //메서드 오버라이딩된 것이 있으면 그것을 우선하여 호출한다.
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
