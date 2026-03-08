package Array;

import java.util.Scanner;

public class month_ArrayLoop1 {
    public static void main(String[] args) {

        String [] months={"January","February","March","April","May","June","July","August",
                "September","October","November","December"};

        Scanner scanner=new Scanner(System.in);

int input=scanner.nextInt();
while (input!=-1){

    System.out.println("The month is" + months[input]+ ".");
input=scanner.nextInt();

}
scanner.close();


    }
}
