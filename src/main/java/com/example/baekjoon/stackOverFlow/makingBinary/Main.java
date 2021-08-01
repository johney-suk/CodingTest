package com.example.baekjoon.stackOverFlow.makingBinary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        String result = makingBinary(num);
            System.out.println(result);

    }
    public static String makingBinary (long num) {
        StringBuilder sb = new StringBuilder();
        long temp = num;
        boolean isEnd =false;

        while (isEnd == false) {
            sb.insert(0, temp % 2);
            temp = temp / 2;
            if (temp==0){
                isEnd = true;
            }
        }
        return sb.toString();
    }
}
