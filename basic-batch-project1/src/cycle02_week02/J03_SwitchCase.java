package cycle02_week02;
/*
    Kullanicidan gelen numaraya gore haftanin hangi gunu oldugunu donduren bir method yaziniz
     input:5
     output:Friday

     input:7
     output:sunday

     */

public class J03_SwitchCase {
    public static void main(String[] args) {


        System.out.println("giveDayNameWithNumber(5) = " + giveDayNameWithNumber(8));


    }

    public static String giveDayNameWithNumber(int number) {
        String result = " ";
        switch (number) {

            case 1:
                result = "Monday";           //if number==1
                break;
            case 2:
                result = "Tuesday";          //else if(number==2)
                break;
            case 3:
                result = "Wednesday";       //else if (number==3)
                break;
            case 4:
                result = "Thursday";        //else if (number==4)
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid Number";


        }
        return result;
    }


}
