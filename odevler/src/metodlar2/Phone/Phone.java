package metodlar2.Phone;

public class Phone {

    public String brand;
    public String model;
    public double price;
    public boolean is5G;
    public char simType;

    public void call(){
        System.out.println("Calling...");
    }public void sendMessage(){
        System.out.println("Message sent.");
    }public void printPhoneInfo(){
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", is5g=" + is5G +
                ", simType=" + simType +
                '}';
    }
}
