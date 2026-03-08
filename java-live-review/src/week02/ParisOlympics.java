package week02;

public class ParisOlympics {
    public static void main(String[] args) {
        String country = "United States";
        int gold = 40, silver = 44, bronze = 42, total = 126;

        System.out.println("Team                Gold\tSilver  Bronze\tTotal");
        System.out.println(country + "\t\t" + gold + "\t\t" + silver + "\t\t " + bronze + "\t\t" + total);

        //use same above variable and change to China details. then print out
         country = "China";
        gold = 40;
        silver = 27;
        bronze = 24;
        total = 91;

        System.out.println(country + "\t\t\t\t" + gold + "\t\t" + silver + "\t\t " + bronze + "\t\t" + total);



    }
}
