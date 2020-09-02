package com.Company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("enter a number between 1 and 12");
        int userNumber = myScanner.nextInt();

        if (userNumber == 1) {
            System.out.println("January");
        }else if (userNumber == 2) {
            System.out.println("February");
        }else if (userNumber == 3) {
            System.out.println("March");
        }else if (userNumber == 4) {
            System.out.println("April");
        }else if (userNumber == 5) {
            System.out.println("May");
        }else if (userNumber == 6) {
            System.out.println("June");
        }else if (userNumber == 7) {
            System.out.println("July");
        }else if (userNumber == 8) {
            System.out.println("August");
        }else if (userNumber == 9) {
            System.out.println("September");
        }else if (userNumber == 10) {
            System.out.println("October");
        }else if (userNumber == 11) {
            System.out.println("November");
        }else if (userNumber == 12) {
            System.out.println("December");
        }else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }

    }
}
