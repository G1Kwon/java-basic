package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("Set Vehicle: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("Driving Vehicle");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
