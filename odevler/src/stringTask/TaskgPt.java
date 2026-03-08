package stringTask;

import java.util.Scanner;

public class TaskgPt {
    public static void main(String[] args) {

String realPassword="2468";

        Scanner scanner=new Scanner(System.in);
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Enter your PIN");
             String password=scanner.nextLine();


            if (password.isBlank()){
                System.out.println("PIN cannot be empty.");

            } else if (!password.equals(realPassword)) {
                System.out.println("Incorrect PIN. Please try again.");

            } else {
                System.out.println("Access granted");
                break;
            }


        } if (i==3){
            System.out.println("Card is blocked");
        }


    }
}
