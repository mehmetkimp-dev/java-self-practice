package Methods;

public class gptQuest2 {
    public static void main(String[] args) {

        String result = evenOrOdd(1, 2);
        System.out.println(result);


    }

    public static String evenOrOdd(int number1, int number2) {

            if (number1 % 2 == 0 && number2 % 2 == 0) {
                ;
                return "both are even";
            } else if (number1 % 2 != 0 && number2 % 2 != 0) {
                return "both are odd";
            } else if (number1 % 2 == 0) {
                return number1 + "is even, " + number2 + "is odd";
            } else {
                return number1 + " is odd, " + number2 + " is even";
            }
        }

    }






