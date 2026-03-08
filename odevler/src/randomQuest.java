import java.util.Scanner;

public class randomQuest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();

        System.out.println("Age= "+age);
        scanner.nextLine();


        System.out.println("Enter your full name");
String fullName=scanner.nextLine();


        System.out.println("Full Name= "+fullName);

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
scanner.close();

    }
}
