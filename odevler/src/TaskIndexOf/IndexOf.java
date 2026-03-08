package TaskIndexOf;

public class IndexOf {
    public static void main(String[] args) {


String text="ORder ID: 78452 Status: Completed";



int secondSpace=text.indexOf(" "+1);
int thirdSpace=text.indexOf(" "+secondSpace+1);


String result=text.substring(secondSpace+1,thirdSpace);

        System.out.println("result = " + result);


    }
}
