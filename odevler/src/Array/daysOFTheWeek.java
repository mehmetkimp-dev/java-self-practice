package Array;

import java.util.Scanner;

public class daysOFTheWeek {
    public static void main(String[] args) {


        String [] dayOfTheWeek={"Monday","Tuesday","Wednesday","Thursday","Friday",
                "Saturday","Sunday"
        };

        Scanner scanner=new Scanner(System.in) ;

        int inputDay=scanner.nextInt();

        while (inputDay!=-1){
             if (inputDay>=1 && inputDay<=7){
                 System.out.println("Today is " + dayOfTheWeek[inputDay-1]);
                 break;
             }else {
                 System.out.println("Invalid day");
             }
                 inputDay=scanner.nextInt();


        }
 scanner.close();





    }
}
