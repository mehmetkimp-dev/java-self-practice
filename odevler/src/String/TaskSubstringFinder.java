package String;

public class TaskSubstringFinder {

    public static void findPosition (String str1,String str2){
        int index=str1.indexOf(str2);


 if (index!=-1){
     System.out.println(index);
 }else{
     System.out.println("Not found");
 }








    }

    public static void main(String[] args) {
        findPosition("First solve the problem.Then,write the code.",
                "solve"
        );






    }




}
