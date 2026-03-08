package odevlerbastan;

public class SubstringPositionFinder {
    public static void main(String[] args) {

String str1="First, solve the problem.Then ,write the code.";
String str2="solve";

int result=positionOfSecondString(str1,str2);


if (result!=-1){
    System.out.println(result);
}else {
    System.out.println("Not found");
}





    }
    public static int positionOfSecondString(String str1,String str2){

        return str1.indexOf(str2);



    }


}