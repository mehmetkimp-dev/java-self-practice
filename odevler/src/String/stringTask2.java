package String;

public class stringTask2 {
    public static void main(String[] args) {


        String word = "I love Java!";


        String output = replaceLastWord(word);


        System.out.println(output);


    }

    public static String replaceLastWord(String word) {

        int lastWord = word.lastIndexOf(" ");
        String firstPart = word.substring(0, lastWord + 1);
        String lastChar = word.charAt(word.length() - 1) + "";

        if (lastChar.equals("!") || lastChar.equals(".") || lastChar.equals("?")) {
            return firstPart + "CODE" + lastChar;
        }

        return firstPart + "CODE";


    }
}