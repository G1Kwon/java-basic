package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        KonaCar konaCar = new KonaCar();

        driver.setKonaCar(konaCar);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setKonaCar(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
