package metodlar2;

public class VowelChecker {
    public static void main(String[] args) {

    String result=  vowelChecker('s');

        System.out.println(result);



}

public static String vowelChecker(char ch){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return ch+ " is a vowel";
        }
        else {
            return ch+ " is not a vowel";
        }
}




}