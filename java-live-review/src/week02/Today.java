package week02;
/*
After live-class practice:
6) Create new class Today and add main method

Let's assign today's date details into variables:
- declare integer variable year and assign current year
- declare String variable month and assign current month
- declare byte variable day and assign today's day
- declare String variable weekDay and assign today's week day
- declare int variable hour and assign current hour
- declare int variable minute and assign current minute

- print out each variable with string concatenation
- print out all values in single statement using concatenation with format:
    "Saturday, November 1, 2025 - 1:48 PM EST"
 */
public class Today {
    public static void main(String[] args) {

int year=2026;
String month="February";
byte day=15;
String weekDay="Sunday";
int hour=20;
int minute=40;
        System.out.println(weekDay+", "+ month+" "+ day +", "+year+" - "+ hour+":"+minute+" PM EST");


        //int Public=40;




    }
}
