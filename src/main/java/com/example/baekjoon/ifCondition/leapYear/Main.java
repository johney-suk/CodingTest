package com.example.baekjoon.ifCondition.leapYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4의 배수 중에
// if 400의 배수이면 "1"
//  else 100의 배수이면 "0"
//
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());

        if (y % 4 == 0) {
            if (y % 400 == 0) {
                System.out.println("1");
            } else if (y % 100 == 0) {
                System.out.println("0");
            } else System.out.println("1");
        } else System.out.println("0");
    }
}
