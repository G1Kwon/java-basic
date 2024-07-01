package poly.ex6;

public class SoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Birds birds = new Birds();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(birds);
        soundAnimal(chicken);

        //fly 인터페이스 구현이 안되어 있기에 안된다.
        //flyAnimal(dog);
        flyAnimal(birds);
        flyAnimal(chicken);
    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal sound test start");
        animal.sound();
        System.out.println("Animal sound test end");
    }

    //Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("Animal fly test start");
        System.out.println("Animal fly test end");
    }
}
