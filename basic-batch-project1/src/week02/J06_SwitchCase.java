package week02;

public class J06_SwitchCase {
    public static void main(String[] args) {
    /*
    Dec,Jan,Feb ---Winter
    June,July,August --- Summer
     */
        //Java 8 ile birlikte
String month="Jan";
switch (month){
    case "Dec":
        break;
    case "Jan":
        break;
    case "Feb":
        System.out.println("Winter");
        break;
    case "June":
        break;
    case "July":
        break;
    case "August":
        System.out.println("Summer");
        break;
}

//Java 14 ile lambda switch






    }


}
