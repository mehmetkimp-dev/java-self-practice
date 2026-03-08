package week03;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10 + 5);
        int apples = 5, bananas = 4;
        int totalNumberOfFruits = apples + bananas;
        System.out.println(apples + bananas);
        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);

        //Subtraction Example - Wallet After Purchase:
        double wallet = 250.40;
        double price = 55.50;
        double remaining = wallet - price;
        System.out.println("remaining = $" + remaining);
        System.out.println(wallet - 30.99);

        //*Multiplication Example - Items in Boxes:
        System.out.println(5 * 3);
        int boxes = 4;
        int itemsPerbox = 2;
        int totalItems = boxes * itemsPerbox;
        System.out.println("totalItems = " + totalItems);

        //  Division Example - Time per Task:
        System.out.println(10 / 5);
        System.out.println(10 / 3);     //3
        System.out.println(10.0 / 3);  //3.333 we have decimals in this (precision)
        int totalMinutes = 15;
        int tasks = 3;
        int minutesPerTask = totalMinutes / tasks;
        System.out.println("minutesPerTask = " + minutesPerTask);

        // Modulus/Remainder Example - :Leftover Chocolates:
        System.out.println(10 % 4);  //4+4+2

        int num = 6;
        System.out.println(num % 2);
        int chocolates=20;
        int friends = 6;
        System.out.println("each one will get -> "+ (chocolates/friends) );
        System.out.println("any left over? -> " + (chocolates % friends) );
        System.out.println();

        System.out.println("Hello"+5+2);
        System.out.println("Hello "+ 5 *2 +1); //Hello101




    }
}
