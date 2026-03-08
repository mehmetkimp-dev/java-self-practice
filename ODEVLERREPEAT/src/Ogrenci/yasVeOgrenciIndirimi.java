package Ogrenci;

public class yasVeOgrenciIndirimi {
    public static void main(String[] args) {


        //degerleri degistirdigimizde istenilene gore cikti veriyor
        // yani eger yas 65uzerinin altinda ise ve ogrenciyse 10% indirim uygulaniyor
        //

double price =100.0;
int age=70;
boolean isStutdent=false;

        //eger kisinin yasi 65 ve uzeriyse,fiyata %20 indirim uygulansin
        //eger kisi ogrenciyse,fiyata ek olarak %10 indirim uygulansin
        //indirimler ayri ayri if bloklari ile kontrol edilsin

        double discount=0;

        if (age>=65){
            discount=price*0.20;
            System.out.println("Discounted price= " + (price-discount));
        } else if (isStutdent){
            discount=price*0.10;
            System.out.println("Discount price="+(price-discount));
        }







    }
}
