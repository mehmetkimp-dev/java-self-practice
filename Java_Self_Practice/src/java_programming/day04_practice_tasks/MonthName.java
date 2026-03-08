package java_programming.day04_practice_tasks;

public class MonthName {
    public static void main(String[] args) {
        int number = 8;

      String month=  switch (number) {
            case 1 -> "January";
            case 2 ->"February";
            case 3 ->"March";
            case 4 ->"April";
            case 5 ->"MAy";
            case 6 ->"June";
            case 7 ->"July";
            case 8 ->"August";
            case 9 ->"September";
            case 10 ->"October";
            case 11 ->"November";
            case 12 ->"December";
          default -> "no such month";
      };

        System.out.println(month);
    }
}
/*
MonthName Task: Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.

			Example 1:
				     number = 10

			Output:
				  October

			Example 2:
				     number = -20

			Output:
				  No such month

 */