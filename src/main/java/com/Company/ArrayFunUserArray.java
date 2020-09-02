package com.Company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        int[] userArray = new int[5];
        int userInt;

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Please enter a number");
            userInt = myScanner.nextInt();
            userArray[i] = userInt;
        }

        System.out.println(Arrays.toString(userArray));

    }
}
