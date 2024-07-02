package poly.car1;

public class KonaCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("KonaCar startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("KonaCar offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("KonaCar pressAccelerator");
    }
}
