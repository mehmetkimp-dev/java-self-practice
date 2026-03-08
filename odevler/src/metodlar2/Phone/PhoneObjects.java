package metodlar2.Phone;

public class PhoneObjects {
    public static void main(String[] args) {


        Phone cep = new Phone();

        cep.brand = "Apple";
        cep.model = "15ProMax";
        cep.price = 1550.50;
        cep.is5G = true;
        cep.simType = '2';


        cep.call();
        cep.sendMessage();
        cep.printPhoneInfo();


    }


}