package ArraysBASTAN;

import java.util.Arrays;

public class newloopeThingie {
    public static void main(String[] args) {


        String [] colors ={"Red","Green","Blue","Yellow"};



        String redColor=colors[0];


        for (int i = 0; i < colors.length-1; i++) {
            colors[i]=colors[i+1];


        }

        colors[colors.length-1]=redColor;

        System.out.println(Arrays.toString(colors));



    }
}
