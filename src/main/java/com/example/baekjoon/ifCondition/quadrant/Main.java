package com.example.baekjoon.ifCondition.quadrant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if 조건문 삼항연산자 메모리 시간 비슷
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

//        if(x>=1){
//            if (y>=1){
//                System.out.println("1");
//            }else
//                System.out.println("4");
//        }else if (x<=1){
//            if (y>=1){
//                System.out.println("2");
//            }else
//                System.out.println("3");
//        }else System.out.println("4");
        if (x>0){
            System.out.println(y>0?"1":"4");
        }else System.out.println(y>0?"2":"3");
    }
}
