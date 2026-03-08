package String;

import java.util.Scanner;

public class execrice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter value:");
        String value=scanner.nextLine();




        if(value.isBlank()){
            System.out.println("Invalid");
            return;
        }
        boolean valid=false;

        if (valid){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }
        



    }
}
