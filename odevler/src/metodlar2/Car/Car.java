package metodlar2.Car;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public boolean isAutomatic;
    public char fuelType;



    public void startEngine(){
        System.out.println("Car engine has started");
    }
    public void drive(){
        System.out.println("Car is driving");
    }
    public void printCarInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isAutomatic=" + isAutomatic +
                ", fuelType=" + fuelType +
                '}';
    }
}
