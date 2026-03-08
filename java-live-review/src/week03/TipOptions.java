package week03;

public class TipOptions {
    public static void main(String[] args) {

        String food = "Burger, Fries, Salad";
        double item1Price = 9.0,
                item2Price = 4.0,
                item3price = 5.0;
        double subTotal = item1Price+item2Price+item3price;


        double tax= subTotal * 0.05;  //5% tax
        double total=subTotal+tax;
        System.out.println("\tThank you for your visit!");
        System.out.println("# Your order : " + food);
        System.out.println("# subtotal\t : $" + subTotal);
        System.out.println("# tax(5%)\t : $" + tax);
        System.out.println("# total\t\t : $" + total);

        System.out.println("\n\tTip options:");
        System.out.println("\t10%\t:\t$"+(subTotal*0.10));
        System.out.println("\t10%\t:\t$"+(subTotal*0.20));
        System.out.println("\t10%\t:\t$"+(subTotal*0.30));






    }
}
