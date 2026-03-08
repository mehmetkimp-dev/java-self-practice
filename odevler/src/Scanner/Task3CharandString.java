package Scanner;

import java.util.Scanner;

public class Task3CharandString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter a character");

        char character=scanner.next().charAt(0);

        System.out.println("You have enterned : "+ character);

        System.out.println("Would you like to continue?");

        String answer= scanner.next();

        System.out.println("You have entered: " + answer);






    }




}
