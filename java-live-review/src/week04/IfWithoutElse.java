package week04;

        public class IfWithoutElse {
            public static void main(String[] args) {
                //☀️ We go out if it is sunny:
                boolean sunny = true;
                if (sunny) {
                    System.out.println("Let's put on sunglasses and go out");
                }
                System.out.println("After sunny condition");

                System.out.println("-------------");
                //🔋 Check if the battery level is low and show a warning:
                int batteryLevel = 10;
                if (batteryLevel < 20) {
                    System.err.println("Battery low!");
                    System.err.println("Charge soon");
                }
                System.out.println("After battery test");
            }
        }


/*
1) Create a new class  IfWithoutElse and add a main method

☀️ We go out if it is sunny:
-Create boolean variable sunny as true
-Use an if statement to check if it is sunny then print:
-"Let's put on sunglasses and go out"

🔋 Check if the battery level is low and show a warning:
-Declare an int variable named batteryLevel and assign it the value 15.
-Use an if statement to check if batteryLevel is less than 20.
-If true, print "Battery low!".
 */