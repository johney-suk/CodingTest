package com.example.baekjoon.makingBinary;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args){

//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
        int num = 25;
        String result = makingBinary(num);
            System.out.println(result);
//        int sum = makingBinary(num);
//        System.out.println(sum);
    }
    public static String makingBinary (int num) {
        StringBuilder sb = new StringBuilder();
        int temp = num;
        boolean isEnd =false;
        
        while (isEnd == false) {
//            sb.append(temp);
            sb.insert(0, temp % 2);
            temp = temp / 2;
            if (temp==0){
                isEnd = true;
            }
        }
        return sb.toString();
    }
}
