package Scanner;

import java.util.Scanner;

public class Task4NextvsNextLine {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter your full name:");
        String fullName=scanner.nextLine();
        System.out.println("Enter your school's name:");
        String school=scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender=scanner.next();
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Enter your street name:");
        scanner.nextLine();
        String streetName=scanner.nextLine();







    }
}
