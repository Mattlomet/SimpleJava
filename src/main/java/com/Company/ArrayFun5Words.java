package com.Company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String[] userArray = new String[5];

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Please enter a word!");
            userArray[i] = myScanner.nextLine();
        }

        System.out.println(Arrays.toString(userArray));

    }

}
