package ArraysBASTAN;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewQuest {
    public static void main(String[] args) {

        int[] scores = {5, 10, 15, 20, 25};
// expected result [10, 15, 20, 25, 5]



        int firstNum=scores[0];

        for (int i = 0; i < scores.length-1; i++) {

            scores[i]=scores[i+1];


        }
                 scores[scores.length-1]=firstNum;


        System.out.println(Arrays.toString(scores));

    }
}
