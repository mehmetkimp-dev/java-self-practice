package week04;

import java.util.function.Predicate;

public class IfElse {
    public static void main(String[] args) {
        boolean hungry = true;
        if (hungry) {
            System.out.println("lets get some snacks");
            System.out.println("Keep coding java");
        } else {
            System.out.println("Not hungry, lets keep coding java");
        }

        System.out.println("-------------");
        int score = 80;
        int passingScore = 60;
        if (score >= passingScore) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }
}