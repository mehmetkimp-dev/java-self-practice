package week05;

public class BreakContinue {
    public static void main(String[] args) {

int num=1;
do {
    System.out.println("num = " + num);
    num++;
    if (num==5){
        System.out.println("Found the number 5");
        break;
    }
}while (num<=10);

        for (int i = 1; i <=10 ; i++) {
            System.out.println("i = " + i);
            if (i==5){
                System.out.println("Found !");
                break;
            }
        }
        System.out.println("-------------------");

        for (int i = 1; i <=100 ; i++) {
         if (i%2==0){
             continue;
         }
            System.out.println("i = " + i);

        }




    }
}
/*
3) Create a new class BreakContinue and add a main method:
🚪 Exit Loop When Number is Found
-Loop through numbers 1 to 10
-Use break when number equals 5
-Print message when number is found

🔢 Skip Even Numbers
-Loop 1 to 100
-Use continue to skip even numbers
-Print only odd numbers

Work days 1 to 5.. 6(Saturday is off)
Loop from 1 - 7 using days.
When you reach 6 print "Weekend is off" and return(stop main method)
 */