package metodlar2.Laptop;

public class Laptop {

    public String brand;
    public String model;
    public double price;
    public boolean isTouchScreen;
    public char operatingSystem;


    public void poweron(){
        System.out.println("Laptop is powering on.");
    }public void openIDE(){
        System.out.println("IDE is opening.");
    }public void printLaptopInfo(){
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isTouchScreen=" + isTouchScreen +
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}
