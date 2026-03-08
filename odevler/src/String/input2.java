package String;

public class input2 {


    public static void main(String[] args) {

String sentence="Java is awesome";

String output=removeMiddleword(sentence);


        System.out.println(output);

    }


    public static String removeMiddleword(String sentence) {
    int firstSpace=sentence.indexOf(" ");
    int secondSpace=sentence.lastIndexOf(" ");

    String firstWord=sentence.substring(0,firstSpace);
    String lastWord=sentence.substring(secondSpace+1);
    return firstWord+" "+lastWord;





    }

}
