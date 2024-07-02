package poly.car0;

public class Driver {

    private KonaCar konaCar;
    private Model3Car model3Car;

    public void setKonaCar(KonaCar konaCar) {
        this.konaCar = konaCar;
    }

    //추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("Drive a car");
        if (konaCar != null) {
            konaCar.startEngine();
            konaCar.pressAccelerator();
            konaCar.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
