package java_programming.day04_practice_tasks;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade = 20;

        boolean isValidGrade = grade > 0 && grade < 19;
        String result = "";

        if (isValidGrade) {

            if(grade>=17){
                result="Grade school";
            } else if (grade>=13) {
                result="College";
            } else if (grade>=9) {
                result="High scool";
            } else if (grade>=6) {
                result="Middle Scool";
            }else {
                result="Elementary school";
            }

        } else {
            result="Invalid grade level";
        }
        System.out.println(result);

    }
}
/*
GradeLevel Task: Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */