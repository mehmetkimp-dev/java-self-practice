package week03;

import java.awt.desktop.AboutEvent;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean knowsPassword = true,
                hasFingerprint = true;


        System.out.println(knowsPassword && hasFingerprint);
        boolean unlocked = knowsPassword && hasFingerprint;
        System.out.println("unlocked = " + unlocked);

        System.out.println("----------------");

        boolean isStudent = false,
                isSenior = true;
        System.out.println(isStudent || isSenior);
        boolean hasDiscount = isStudent || isSenior;
        System.out.println("hasDiscount = " + hasDiscount);

        double price = 22.50;
        boolean freeShipping = false;
        boolean buying = price < 30 || freeShipping;
        System.out.println("buying = " + buying);

        System.out.println("---------------------");
        boolean isSunny = true;
        System.out.println(!isSunny);



    }
}
