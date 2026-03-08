package Scanner;

import java.util.Scanner;

public class randomTAskkendikendime {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullName=scanner.nextLine();

        System.out.println(fullName);
        System.out.println("Enter your schools name");
        String schoolName=scanner.nextLine();

        System.out.println(schoolName);
        System.out.println("Enter your gender");
        String gender=scanner.nextLine();
        System.out.println(gender);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println(age);
        System.out.println("Enter your street name");
        scanner.nextLine();
        String streetName=scanner.nextLine();
        System.out.println(streetName);

        scanner.close();



    }
}
