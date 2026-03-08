package String;

public class onlyFirstWordTask {
    public static void main(String[] args) {

        String sentence="Learning Java is fun.";


String result=removeFirstWord(sentence);

        System.out.println(result);



    }

    public static String removeFirstWord(String sentence) {


    int firstSpace=sentence.indexOf(" ");


        String outPut=sentence.substring(firstSpace+1);

return outPut;


    }
}
