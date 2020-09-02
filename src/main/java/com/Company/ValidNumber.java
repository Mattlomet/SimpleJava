package com.Company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int userInt;

        do {
            System.out.println("enter a number between 1 and 10");
            userInt = myScanner.nextInt();
            if (userInt < 1 || userInt > 10){
                System.out.println("You must enter a number between 1 and 10, please try again.");
            }
        }while (userInt < 1 || userInt > 10);{
            System.out.println(userInt);
        }
    }
}

