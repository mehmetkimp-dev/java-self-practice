package java_programming.day04_practice_tasks;

public class Grade2 {
    public static void main(String[] args) {

        char grade='A';
        String result;

switch (grade){
    case 'A':
    case 'a':
        result="Excellent";
    break;
        case 'B':
        case 'b':
            result="Great job";
    break;
    case 'C':
    case 'c':
        result="Good";
    break;
    case 'D':
    case 'd':
        result="Passed";
    break;
    case 'F':
    case 'f':
        result="Failed";
    break;
    default:
        result="Invalid Grade";

}
        System.out.println(result);

    }
}
/* USE SWITCH STATAMENTS TO COMPLETE THE FOLLOWING TASKS
Grade2 Task: Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job
 */