package metodlar2.Car;

public class CarObjects {
    public static void main(String[] args) {

        Car Bmw =new Car();
        Bmw.brand="Bmw";
        Bmw.model="X1";
        Bmw.year=2023;
        Bmw.price=47000;
        Bmw.isAutomatic=true;
        Bmw.fuelType='G';

        Bmw.startEngine();
        Bmw.drive();
        Bmw.printCarInfo();




    }
}
