package com.example.baekjoon.greedy.coin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int arr[] = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = N-1; i >= 0; i--) {
            while (arr[i] <= K) {
                K -= arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}