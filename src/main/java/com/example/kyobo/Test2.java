package com.example.kyobo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));
    }
    public static int solution(String s) {

        int answer = Integer.MAX_VALUE;

        if (s.length() == 1) return 1;

        for (int i = 1; i <= s.length() / 2; i++) {
            String str = "";
            String temp = "";
            int count = 1;

            String xxx = "";

            for (int j = 0; j < s.length() / i; j++) {
                if (temp.equals(s.substring(j * i, (j * i) + i))) {
                    count++;
                    continue;
                }
                if (count > 1) {
                    str += count + temp;
                    count = 1;
                } else {
                    str += temp;
                }
                temp = s.substring(j * i, (j * i) + i);
            }

            if (count > 1) {
                str += count + temp;
                count = 1;
            } else {
                str += temp;
            }

            if (s.length() % i != 0) {
                str += s.substring(s.length() - s.length() % i, s.length());
            }
            answer = answer > str.length() ? str.length() : answer;

        }
        return answer;
    }
}
