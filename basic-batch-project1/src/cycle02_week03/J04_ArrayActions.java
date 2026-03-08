package cycle02_week03;

import java.util.Arrays;

public class J04_ArrayActions {
    public static void main(String[] args) {
                       //0         1        2        3
        String[] group={"Ahmet","Mehmet","Yakup","Gulsen"};

        String[] group2=new String[10];

        System.out.println(group[3]);

        System.out.println(group.length);
        System.out.println(group[group.length-1]); //sonuncu kisiyi almak istiyor iken


        group2[0]="Sema";
        group2[4]="Yildiz";
        System.out.println(Arrays.toString(group2)); //arrays yazdirmak icin Arrays.toString

        group2[group2.length-1]="Neslihan"; //group2'ye son satira ekleme yapmak icin




    }
}
