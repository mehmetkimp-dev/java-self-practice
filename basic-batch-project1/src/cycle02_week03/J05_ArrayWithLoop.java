package cycle02_week03;

public class J05_ArrayWithLoop {
    public static void main(String[] args) {

                     //   -6      -5      -4        -3        -2        -1  bunlar lengthleri
        String[] group={"Ahmet","Mehmet","Yakup","Gulsen","Neslihan","Huseyin"};


        for (int i = group.length-3; i < group.length; i++) {  //son 3 elemani yazdirmak istiyorsak
            System.out.println(group[i]);

        }






    }
}
