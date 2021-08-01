package com.example.baekjoon.inputAndCalculations.multiply;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a= scan.nextInt(),b=scan.nextInt();

        // b 1의자리
        int result = a*((b%100)%10);

        // b 10의자리
        int result2 = a*((b%100)/10);

        // b 100의자리
        int result3 = a*(b/100);

        int result4 = a*b;



        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
