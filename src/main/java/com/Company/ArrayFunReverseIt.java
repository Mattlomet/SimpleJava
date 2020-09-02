package com.Company;

import java.util.Arrays;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        int[] arrayOne = {1,2,3,4,5};
        int[] arrayTwo = new int[arrayOne.length];

        int downCount = arrayOne.length-1;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[downCount];
            downCount--;
        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

    }
}
