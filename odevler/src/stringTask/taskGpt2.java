package stringTask;

import java.util.Scanner;

public class taskGpt2 {
    public static void main(String[] args) {


        String realUsername="admin";

        Scanner scanner=new Scanner(System.in);
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Enter username");
            String username=scanner.nextLine();

            if (username.isBlank()){
                System.out.println("Username cannot be empty");
            } else if (!username.equals(realUsername)) {
                System.out.println("Incoreect username.Try again.");

            }else {
                System.out.println("Welcome");
                break;
            }


        }

        if (i==3){
            System.out.println("Account locked");
        }




    }
}
