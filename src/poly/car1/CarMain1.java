package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //select vehicle(KONA)
        KonaCar konaCar = new KonaCar();
        driver.setCar(konaCar);
        driver.drive();

        //select vehicle(MODEL3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
    }
}
