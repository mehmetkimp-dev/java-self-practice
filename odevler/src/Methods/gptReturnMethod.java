package Methods;

public class gptReturnMethod {
    public static void main(String[] args) {

String result= largerNumber(1,3);

        System.out.println(result);




    }
public static String largerNumber(int number1,int number2){
        if (number1>number2){
            return number1+" ";
        }else if (number1<number2){
            return number2+ " ";
        }else {
            return ("Both numbers are equal");
        }
}


}
