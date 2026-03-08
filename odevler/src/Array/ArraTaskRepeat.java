package Array;

import java.util.Scanner;

public class ArraTaskRepeat {
    public static void main(String[] args) {

        String [] months={"January","February","March","April","May","June","July","August",
                "September","October","November","December"
        };

        Scanner scanner=new Scanner(System.in);

        int input1=scanner.nextInt();

        System.out.println("The month is " +months[input1-1]+".");

        int input2=scanner.nextInt();
        System.out.println("The month is "+months[input2-1]);









    }
}
