package ArraysBASTAN;

import java.util.Arrays;

public class task2gPtPractice {
    public static void main(String[] args) {


        int[] arr={1,2,3};

        int firstNum=arr[0];


        for (int i = 0; i < arr.length-1; i++) {

            arr[i]=arr[i+1];


        }
             arr[arr.length-1]=firstNum;

        System.out.println(Arrays.toString(arr));







    }
}
