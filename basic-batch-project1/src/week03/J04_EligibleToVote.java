package week03;

public class J04_EligibleToVote {
    public static void main(String[] args) {

   eligibleToVote(15,  true);

    }

//1 yas biligis lazim (int yas)
    //2 turkiye vatandasi (boolean deger)

    public static void eligibleToVote(int age,boolean isTCCitizen){
        //TODO HOMEWORK difference between & and &&

        if (age>=18&&isTCCitizen){
            System.out.println("Elgibile to vote");
        }else {
            System.out.println("Not elgible to vote");
        }

    }


}
