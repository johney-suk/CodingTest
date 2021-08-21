package com.example.baekjoon.kyobo;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = 3;
//        int K = 8;
        int A ;
        int B ;


    for (int i = 1; i < N; i++) {

        list.add(i);
        list.add(i);
    }
        int result = list.get(list.size() - 2) + list.get(list.size() - 1);
        System.out.println(result);

//        int n2 = list.get(list.size() - 1);
//        int n1 = list.get(list.size() - 2);
//        int total = n2 + n1;
//        System.out.println(list);

    }

//    public static int fibonacci(int num) {
//        return 0;
//    }
}
