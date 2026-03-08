package Scanner;

import java.util.Scanner;

public class ScannerTaskGpt {


    public static void printNumber(String label,int number){
        System.out.println(label+number);

    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter four numbers:");


        int first= scanner.nextInt();
        int second = scanner.nextInt();
        int third= scanner.nextInt();
        int fourth= scanner.nextInt();

        printNumber("FIRST NUMBER -> " , first);
        printNumber("SECOND NUMBER-> ", second);
        printNumber("THIRD NUMBER-> ",third);
        printNumber("FOURTH NUMBER-> ",fourth);






    }





}
