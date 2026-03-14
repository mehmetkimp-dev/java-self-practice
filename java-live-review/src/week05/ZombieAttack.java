package week05;

public class ZombieAttack {
    public static void main(String[] args) {

        int cityPopulation = 6;
                int day = 0;

                while (cityPopulation > 0) {

                    System.out.println("Day " + day + " [" + cityPopulation + "]");

                    cityPopulation /= 2;
                    day++;
                }

            }

        }






        /*
Create a new class ZombieAttack and add a main method
🧟‍♂️ City population decreases by half each day due to Zombie attack:
        -Create a variable cityPopulation
Ex:
cityPopulation:
        6
Output:
Day 0 [6]
Day 1 [3]
Day 2 [1]
        ---- EXTINCT ----
Ex:
cityPopulation:
        20
Output:
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
        ---- EXTINCT ----
        */