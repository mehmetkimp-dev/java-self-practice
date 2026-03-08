package Scanner;

import java.util.Scanner;

public class Task2TrueFalse {
    public static void main(String[] args) {

        System.out.println("Enter two decimal numbers");


        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Roses are red, true or false?");
        Boolean r = scanner.nextBoolean();
        scanner.close();


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);

    }
}
