package com.example.baekjoon.ifCondition.testScore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// buffered 시간 메모리 우세
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String temp = br.readLine();
//        int score = Integer.parseInt(temp);
//
//        if (score>= 90) System.out.println("A");
//        else if (score>= 80) System.out.println("B");
//        else if (score>= 70) System.out.println("C");
//        else if (score>= 60) System.out.println("D");
//        else System.out.println("F");
        Scanner scanner=new Scanner(System.in);

        int A=scanner.nextInt();

        System.out.println((A>=90)?"A":(A>=80)?"B":(A>=70)?"C":(A>=60)?"D":"F");
    }
}
