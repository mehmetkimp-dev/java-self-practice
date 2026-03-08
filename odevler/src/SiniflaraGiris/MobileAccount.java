package SiniflaraGiris;

public class MobileAccount {

    double balance;
    String ownerName;
    long phoneNumber;





    public void addBalance(double amount){
        balance+=amount;
        System.out.println("Adding $"+amount +"to "+ phoneNumber);
    }

    public void makeCall(int minutes){
        double cost=minutes*2;

        if (balance>=cost){
            balance-=cost;
            System.out.println("Calling for "+ minutes +" minutes from "+ phoneNumber);

        }else {
            System.out.println("insufficient balance for call from"+ phoneNumber);
        }

    }
    public void sendSms(int count){
        double cost=count*1;
        if (balance>=cost){
            balance-=cost;
            System.out.println("Sending "+ count + " messages from "+ phoneNumber);
        }else {
            System.out.println("insufficient balance to send messages from "+ phoneNumber);
        }

    }

    public void showInfo(){
        System.out.println("-------------");
        System.out.println("ownder:" + ownerName );
        System.out.println("phone number: " + phoneNumber);
        System.out.println("balance : $ "+ balance);
        System.out.println("--------------");
    }




}
