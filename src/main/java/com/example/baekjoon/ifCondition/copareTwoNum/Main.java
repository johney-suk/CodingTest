package com.example.baekjoon.ifCondition.copareTwoNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// bufferdReader sanner보다 메모리 시간 효율 좋음
// if vs 삼항연산자 메모리 시간 둘다 비슷, 코드 길이에서 차이
// buffered.read 사용시 왜 같은숫자 구분못하는지? 이유: ASCI 코드로 값 구분
public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st =new StringTokenizer(str," ");
        int A =Integer.parseInt(st.nextToken());
        int B =Integer.parseInt(st.nextToken());
//        System.out.println(str);
//        int A=scan.nextInt(), B= scan.nextInt();
//        if(A>B){
//            System.out.println(">");
//        }else if(A<B){
//            System.out.println("<");
//        }else if(A==B){
//            System.out.println("==");
//        }
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
    }
}
