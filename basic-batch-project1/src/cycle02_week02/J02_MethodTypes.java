package cycle02_week02;

import java.util.Random;

public class J02_MethodTypes {
    public static void main(String[] args) {

        System.out.println("generateRandomNumberFrom1to100() = " + generateRandomNumberFrom1to100());

        System.out.println("generateRandomNumberFrom1toN() = " + generateRandomNumberFrom1toN(5));
    }

    /*  METHOD Tipleri
    Parameter
    Return Type

    1- No Parameter - No Return Type
    2- No Parameter - Yes Return Type
    3- Yes Parameter - No Return Type
    4- Yes Parameter - Yes Return Type


     */
    public static void sayHello() {
        System.out.println("Hello World");      // 1 (method tipi)
    }

    public static int generateRandomNumberFrom1to100() {
        Random random = new Random();                         //2 (method tipi)

        return random.nextInt(100) + 1;

    }

    public static int generateRandomNumberFrom1toN(int n) {
        Random random = new Random();
                                                               //4 (method tipi_)
        return random.nextInt(n) + 1;


    }
}