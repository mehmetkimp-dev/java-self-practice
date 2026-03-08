package stringTask;

import java.util.Scanner;

public class tasGpt3 {
    public static void main(String[] args) {

        String realMail ="user@mail.com";

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (; i < 3; i++) {

            System.out.println("Enter email:");
            String email = scanner.nextLine();


            if (email.isBlank()) {
                System.out.println("Email cannot be empty");
            } else if (!email.equals(realMail)) {
                System.out.println("Incorrect email.Try again");

            } else {
                System.out.println("Email verified");
                break;
            }



        }
        if (i == 3) {
            System.out.println("Account locked.");

        }


    }


}
