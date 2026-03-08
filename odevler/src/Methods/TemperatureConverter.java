package Methods;

public class TemperatureConverter {
    public static void main(String[] args) {

        String result=fahrenheitToCelsius(50);

        System.out.println(result);


    }

    public static String fahrenheitToCelsius(double fahrenheit){
        double celsius=(fahrenheit-32)*5/9;
        return fahrenheit+" Fahrenheit is equal to "+ celsius +" Celsius.";

    }



}
