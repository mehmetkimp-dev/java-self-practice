package Methods;

public class GptPositiveNegativeOrZero {
    public static void main(String[] args) {

     String result=   gptPositiveNegativeOrZero(5);

        System.out.println(result);


    }
    public static String gptPositiveNegativeOrZero(int number){
        if (number>0){
           return (number+" is positive");
        } else if (number<0) {
            return (number+" is negative");
        }else {
            return (number+" is zero");
        }


    }



}
