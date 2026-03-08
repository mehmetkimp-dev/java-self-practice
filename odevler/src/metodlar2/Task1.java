package metodlar2;

public class Task1 {
    public static void main(String[] args) {

String result= temperatureConverter(50);
        System.out.println(result);

    }

    public static String temperatureConverter(int number){
        double celsius=((number-32)*5/9);
        return number+" Fahrenheit is equal to "+ celsius+" Celsius";
    }

}
