package Scanner;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter four different numbers");


        int first = scanner1.nextInt();
        int second = scanner1.nextInt();
        int third = scanner1.nextInt();
        int fourth = scanner1.nextInt();

        //Close the scanner



        //Printing the results
        System.out.println("first number: " + first);
        System.out.println("second number: " + second);
        System.out.println("third number: " + third);
        System.out.println("fourth number: " + fourth);

        System.out.println("Numbers entered successfully!");
        scanner1.close();

    }


}
