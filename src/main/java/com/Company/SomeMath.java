package com.Company;

public class SomeMath {
//    total 5 , average 5 , largest 5,
    public static int total5(int a, int b, int c, int d, int e){

        int total = a+b+c+d+e;

        System.out.println(total);
        return total;
    }

    public static double average5(int a, int b, int c, int d, int e){

        int totalBeforeAvg = a+b+c+d+e;
        double total = totalBeforeAvg/5;

        System.out.println(total);
        return total;
    }
    public static double largest5(double a, double b, double c, double d, double e){

        if (a > b && a > c && a > d && a > e) {
            System.out.println(a);
            return a;
        }else if (b > a && b > c && b > d && b > e) {
            System.out.println(b);
            return b;
        }else if (c > a && c > b && c > d && c > e) {
            System.out.println(c);
            return c;
        }else if (d > a && d > b && d > c && d > e) {
            System.out.println(d);
            return d;
        }else if (e > a && e > b && e > c && e > d) {
            System.out.println(e);
            return e;
        }

        return 0;
    }

    public static void main(String[] args) {
        total5(1,2,3,4,5);
        average5(1,3,5,7,9);
        largest5(42.0,35.1,2.3,40.2,15.6);

    }
}
