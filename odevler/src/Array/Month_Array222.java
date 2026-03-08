package Array;


import java.util.Scanner;

public class Month_Array222 {
    public static void main(String[] args) {



String [] countries={
        "Greece","Turkey","Italy","Germany","France"
};

Scanner scanner=new Scanner(System.in);

int input=scanner.nextInt();

if (input >=1 && input <=5){
        System.out.println("Your country is " + countries[input-1]);
    }
else{
        System.out.println("Wrong input");
    }




    }




}


