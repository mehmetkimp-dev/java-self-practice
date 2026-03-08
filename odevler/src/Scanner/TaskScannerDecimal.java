package Scanner;

import java.util.Scanner;

public class TaskScannerDecimal {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first decimal:");
        double first=scanner.nextDouble();
        System.out.println("Enter second decimal:");
        double second= scanner.nextDouble();
        System.out.println("Enter trule or false:");
        boolean value=scanner.nextBoolean();

        System.out.println("num1="+first);
        System.out.println("num2="+second);
        System.out.println("r="+value);

scanner.close();

    }






}
