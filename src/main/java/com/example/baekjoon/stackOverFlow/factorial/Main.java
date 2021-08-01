package com.example.baekjoon.stackOverFlow.factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sum = function(num);

        System.out.println(sum);
    }
    public static int function (int num) {
        if (num <=1) {
            return 1;
        }else {
            return num * function(num - 1);
        }
    }
}