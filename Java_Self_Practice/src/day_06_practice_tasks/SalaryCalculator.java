package day_06_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {

        System.out.println(salary(45,40));




    }
    public static double salary(double hourly, int weekly){
     return hourly * weekly * 52; // 52 is number of weeks in a year



    }



}
/*
SalaryCalculator Task: Create a class named SalaryCalculator and create a method named
salary that takes hourly rate (double) and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0


 */