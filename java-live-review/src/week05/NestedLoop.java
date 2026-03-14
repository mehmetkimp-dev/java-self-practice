package week05;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);

            }
            System.out.println("-------------------");

        }



    }
}
/*
4) Create a new class NestedLoop and add a main method:

🔁 Multiplication Table (1 to 10)
-Use an outer loop from 1 to 10 (for rows)
-Use an inner loop from 1 to 10 (for columns)
-Print multiplication results
 */