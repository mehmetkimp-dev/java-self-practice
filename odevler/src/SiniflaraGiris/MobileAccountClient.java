package SiniflaraGiris;

public class MobileAccountClient {
    public static void main(String[] args) {

MobileAccount Mobileaccount1=new MobileAccount();


Mobileaccount1.ownerName="John Doe";
Mobileaccount1.phoneNumber=555123456;

Mobileaccount1.addBalance(20);
Mobileaccount1.makeCall(5);
Mobileaccount1.sendSms(15);
Mobileaccount1.showInfo();




    }
}
