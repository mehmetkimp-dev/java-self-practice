package week04;

public class SwitchStatement {
    public static void main(String[] args) {
        int option=1;
        switch (option){
            case 1 -> System.out.println("Start New Game");
            case 2-> System.out.println("Resume Game");
            case 3-> System.out.println("Exit");
            default -> System.out.println("Invalid option");
        }




    }
}
/*
5) Create a new class SwitchStatement and add a main method

🎮 Game Menu Option:
-Declare int variable option as 2;
-Use a switch to print action based on menu choice:
    1 → "Start New Game"
    2 → "Resume Game"
    3 → "Exit"
    Others -> "Invalid option"
 */