package Methods;

public class ReturnOddEven {
    public static void main(String[] args) {

 String result=   numberOddOrEven(100);
        System.out.println(result);


    }

    public static String numberOddOrEven(int num){
        if (num%2==0){
            return (num + " is even number");}
          else {
            return (num+" is odd number");

        }

    }


}
