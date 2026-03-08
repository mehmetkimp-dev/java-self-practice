package week02;

public class J04_GradeToLetter {
    public static void main(String[] args) {
        /*
        not >90 --->AA
        not> 80 ile 90 arasi  ---> BB
        not> 60 ile 80 arasi --->CC
        60 asagisi ---->DD
         */
        int grade=90;
        if (grade>=90){
            System.out.println("AA");
        } else if (grade<90 && grade>=80) {
            System.out.println("BB");
        } else if (grade<80 && grade>=60) {
            System.out.println("CC");
        } else {
            System.out.println("DD");

        }


    }

}
