package Ogrenci;

public class ogrenciIndirimi {
    public static void main(String[] args) {

        double price= 220.0;
        boolean isStudent=false;
        double discountedPrice=0;
        if (isStudent){
            discountedPrice=price*0.20;

            System.out.println("Final price after discount= "+ "$" + (price-discountedPrice));
        }else {
            System.out.println("Not eligible for discount");
            System.out.println("Price is= "+"$"+price);
        }










    }
}
