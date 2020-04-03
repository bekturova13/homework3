package com.company;

public class Main {

    public static void main(String[] args) {
        double[] digits = {1.5, 2.4, 1.1, -5.3, 6.8, 15.6, 3.5, 9.3, 2.18, 33.24, -1.8, 23.14, -9.6, 4.4, 0.2};
        double average = 0;
        int length=0;
        double result;
        boolean b=false;
        for (double i:digits) {
            if(i<0) {
                b = true;
            }
            if (b && i>0) {average+=i;
            length++;}


        }result= average/length;
        System.out.println(result);
    }
}