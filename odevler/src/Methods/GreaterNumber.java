package Methods;

public class GreaterNumber {
    public static void main(String[] args) {


        greaterNumber(10,20);





    }

    public static void greaterNumber(int num1,int num2){
        if (num1>num2){
            System.out.println(num1+" is greater");
        }else if (num1<num2){
            System.out.println(num2+" is greater");
        }else {
            System.out.println("Numbers are equal");
        }



    }



}
