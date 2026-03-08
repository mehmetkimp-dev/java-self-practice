package ArraysBASTAN;

import java.util.Arrays;

public class DaysofTheWeek {

    public static void main(String[] args) {

    String [] daysOftheWeek={"Monday", "Tuesday","Wednesday","Thursday","Friday",
            "Saturday","Sunday"};



        System.out.println(Arrays.toString(daysOftheWeek));

/*int numberOFtheDAys=daysOftheWeek.length;
        System.out.println(numberOFtheDAys);

//int lastIndex=numberOFtheDAys-1;
      //  System.out.println(lastIndex);
*/


String day1= daysOftheWeek[0];

        System.out.println(day1);

        for (int i = 0; i < daysOftheWeek.length - 1; i++) {
            daysOftheWeek[i]=daysOftheWeek[i+1];


        }
daysOftheWeek[daysOftheWeek.length-1]= day1;
        System.out.println(Arrays.toString(daysOftheWeek));


    }


}
