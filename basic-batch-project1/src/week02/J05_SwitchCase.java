package week02;

public class J05_SwitchCase {
    public static void main(String[] args) {
    /*
    snake_case
    lowerCamelCase
    upperCamelCase
    kebab-case
    */
        int dayNumber=1;
        if (dayNumber==1){
            System.out.println("Monday");
        } else if (dayNumber==2) {
            System.out.println("Tuesday");
        }else if (dayNumber==3){
            System.out.println("Wednesday");
        }

        //int char string data tiplerini kabul ediyor (switch)
        System.out.println("-------------------");
switch (dayNumber){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
break;

    default:
        System.out.println("Invalid day");
}

    }

}
