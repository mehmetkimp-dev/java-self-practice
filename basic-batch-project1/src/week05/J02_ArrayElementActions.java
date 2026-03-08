package week05;

public class J02_ArrayElementActions {
    public static void main(String[] args) {


  //index will start from 0
String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};


        System.out.println(days[0]);


//Bugun gunlerden pazartesi 3 gun sonra hangi gun olur //cevap persembe


//0 konumunda 0+3 index

        System.out.println(days[(0+10)% days.length]);
/*
Monday 0
Tuesday 1
Wed     2
Thu     3
Fr     4
Sa     5
Sun    6
Mon    7
Tue    8
Wed    9
Thur   10


 */






    }
}
