package Scanner;

import java.util.Scanner;

public class Task5SumofNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int number;
        while (true){
            System.out.println("Enter a number: ");
number =scanner.nextInt();

if (number<0){
    break;
}
        sum+=number; //sum=sum+number;
        }
        System.out.println("The sum of the number is :" + sum);
        scanner.close();




        }

    }


