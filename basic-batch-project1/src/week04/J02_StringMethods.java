package week04;

public class J02_StringMethods {
    public static void main(String[] args) {
          //indexler 0dan baslar
        //             0123
        String name="Adam";
        String name2="ADAM";
        String name3="Adam";
//Belirli indexteki karakteri veriyor
        System.out.println("name.charAt(0) = " + name.charAt(0));

        //
        System.out.println("name.equals(name2) = " + name.equals(name2)); //false
        System.out.println("name.equals(name3) = " + name.equals(name3)); //true


        //


        System.out.println("name.equalsIgnoreCase(name2) = " + name.equalsIgnoreCase(name2)); //true

//
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
//


        System.out.println("name.toUpperCase() = " + name.toUpperCase());

//iki deger donebilir biri pozitif dogrudan indexi yada -1 doner yani bu karakter yok anlaminda
        System.out.println("name.indexOf(\"A\") = " + name.indexOf("a"));
//
        System.out.println("name.contains(\"A\") = " + name.contains("A"));
        //
        System.out.println("name.substring(2) = " + name.substring(0));
        //son index dahil degildir
        System.out.println("name.substring(2,3) = " + name.substring(2, 4));
        //
        System.out.println("name.length() = " + name.length());


    }
}
