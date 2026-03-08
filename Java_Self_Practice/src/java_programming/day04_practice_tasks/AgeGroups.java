package java_programming.day04_practice_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 21;
     if (age<0||age>150){
         System.out.println("Invalid");
     return;
     }if (age <= 20) {
            System.out.println("Teenager");
        } else if (age < 55) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        /*   if (age>=0&& age<=20){
            System.out.println("Teenager");
        }else if (age<55){
            System.out.println("Adult");
        } else if (age<=150) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid");
        }
*/
     /*   boolean teenager = age >= 0 && age <= 20,
                adult = age >= 21 && age < 55,
                senior = age >= 55 && age <= 150;
        String result="";

        if (teenager) {
            result = "Teenager";
        } else if (adult) {
            result = "Young Middle-Aged Adult";
        } else if (senior) {
            result = "You are Senior";

        } else {
            result="Invalid";
        }

        System.out.println(result);

      */
    }
}
/*
AgeGroups Task: Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */