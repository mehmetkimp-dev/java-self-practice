package Scanner;

import java.util.Scanner;

public class ScannerMethod {

    public static int readNumber(Scanner scanner){
        return scanner.nextInt();
    }


    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);

        System.out.println("Enter four different numbers:");

        int first=readNumber(scanner1);
        int second=readNumber(scanner1);
        int third=readNumber(scanner1);
        int fourth=readNumber(scanner1);
        System.out.println("Numbers entered successfully!");
        System.out.println("first number: "+ first);
        System.out.println("second number : "+ second);
        System.out.println("third number : "+ third);
        System.out.println("fourth number : "+ fourth);
        scanner1.close();





    }


}
