package week03;

public class ShorthandOperators {
    public static void main(String[] args) {

        int score = 10;
        System.out.println("Score = " + score);
        score += 5;
        System.out.println("Score = " + score);
        score = score + 3;
        System.out.println("Score = " + score);

        System.out.println("-----------------");

        int wallet = 100;
        wallet -= 30;
        wallet = wallet - 10; //this is the longer way
        System.out.println("wallet = " + wallet);

        System.out.println("--------------------------");

        int boxes = 3;
        System.out.println("boxes = " + boxes);
        boxes *= 4;
        System.out.println("boxes = " + boxes);

        System.out.println("--------------------");
        int totalPages = 100;
        totalPages /= 5;
        System.out.println("totalPages = " + totalPages);

        int coins = 555;
        int change = coins % 100;
        coins /= 100; //coins=coins/100;
        System.out.println("coins for full dollars = " + coins);
        System.out.println("change = " + change);

        String str = "Hello";
        str += " World";
        System.out.println("str = " + str);





    }
}
