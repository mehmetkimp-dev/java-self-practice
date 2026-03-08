package ArraysBASTAN;

import java.util.Arrays;

public class gpt_TaskrightToleft {

    public static void main(String[] args) {


        int [] numbers={10,20,30,40};


        int firstNum=numbers[0];


        for (int i = 0; i < numbers.length-1; i++) {
            numbers[i]=numbers[i+1];



        }

numbers[numbers.length-1]=firstNum;

        System.out.println(Arrays.toString(numbers));

    }
}
