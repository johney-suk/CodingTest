package com.example.baekjoon.kyobo;

import java.util.*;

public class Test5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() + " ";
        String result = "";
        int cnt = 1;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                result += s.charAt(i);
                if (cnt > 1) {
                    result += Integer.toString(cnt);
                }
                System.out.println(cnt);
                System.out.println(result);

                cnt = 1;
            }
        }
        System.out.println(result);
    }
}

