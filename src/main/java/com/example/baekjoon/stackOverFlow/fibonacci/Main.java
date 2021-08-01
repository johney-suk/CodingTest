package com.example.baekjoon.stackOverFlow.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sum = fibonacci(num);

        System.out.println(sum);
    }
    public static int fibonacci (int num) {
        if (num == 0) {
            return 0;
        }else if (num <=2) {
            return 1;
        } else {
            return fibonacci(num - 1)+ fibonacci(num - 2);
        }
    }
}
