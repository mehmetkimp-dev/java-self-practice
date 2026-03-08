package week03;

public class UnaryOperators {
    public static void main(String[] args) {
        int inbox = 10;
        inbox++; //increase by 1
        ++inbox;
        System.out.println("inbox = " + inbox); //12


        inbox = inbox + 1;
        System.out.println("inbox = " + inbox); //13

        System.out.println("------------------");

        int lives= 3;
        System.out.println("Lives: " +lives);
        lives--;

        System.out.println("lives = " + lives);

        int num = -5;
        System.out.println("num = " + num);
        System.out.println(num+2);





    }
}
