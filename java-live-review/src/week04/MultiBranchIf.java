package week04;

public class MultiBranchIf {
    public static void main(String[] args) {
        int rank = 1;
        if (rank == 1) {
            System.out.println("Gold");
        } else if (rank == 2) {
            System.out.println("Silver");
        } else if (rank == 3) {
            System.out.println("Bronze");
        } else {
            System.out.println("No medal, try again next time");
        }
        System.out.println("-------------------");

        int hour = 7;
        if (hour >= 6 && hour <= 10) {
            System.out.println("Breakfast time");
        } else if (hour >= 11 && hour <= 14) {
            System.out.println("Lunch time");
        } else if (hour >= 15 && hour <= 17) {
            System.out.println("Snack time");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("Dinner time");
        } else {
            System.out.println("Kitchen is closed");
        }


    }
}
/*
3) Create a new class MultiBranchIf and add a main method

🥇 Identify medal:
-Declare an int variable rank as 1
Use an if-else-if statement to print the medal:
    -rank 1 -> "Gold"
    -rank 2 -> "Silver"
    -rank 3 -> "Bronze"
    -others -> "No medal, try again next time"

🍽️ Meal Recommendation Based on Time
-Declare an int variable hour (use 24-hour format).
    -Use if-else-if to recommend a meal based on the hour:
    -6–10 → "Breakfast time"
    -11–14 → "Lunch time"
    -15–17 → "Snack time"
    -18–21 → "Dinner time"
    -Otherwise → "Kitchen is closed"
 */