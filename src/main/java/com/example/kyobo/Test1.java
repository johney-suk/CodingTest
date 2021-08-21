package com.example.kyobo;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        boolean isAnswer = false;
        int n1;
        int n2;

        if (K % 2 == 0) {
            n1 = K / 2;
            n2 = K / 2;
        } else {
            n1 = K / 2;
            n2 = K / 2 + 1;
        }

        while (true) {
            if (isAnswer == true) {
                System.out.println("A=" + n1 + ",B=" + n2);
                break;
            }
            isAnswer = isCorrect(n1, n2, N - 1);
            n1 -= 1;
            n2 += 1;
        }
    }

    public static boolean isCorrect(int n1, int n2, int N) {
        int temp = N;
        int count = 2;
        while (count < N) {
            count++;
            temp = n2 - n1;
            if (temp > n1) {
                break;
            }
            n2 = n1;
            n1 = temp;
        }
        if (count == N) {
            return true;
        } else {
            return false;
        }
    }
}
