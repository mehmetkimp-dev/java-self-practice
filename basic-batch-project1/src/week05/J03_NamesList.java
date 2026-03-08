package week05;

import java.util.Arrays;

public class J03_NamesList {

    public static void main(String[] args) {

String[] names=new String[5];

        System.out.println("names[0] = " + names[0]);


        names[0]="Adam";
        names[1]="Ozlem";
        System.out.println(Arrays.toString(names));
        names[2]="Mehmet";
        names[3]="Gokay";
        System.out.println(Arrays.toString(names));
        names[4]="Sema";
        System.out.println(Arrays.toString(names));



    }
}
