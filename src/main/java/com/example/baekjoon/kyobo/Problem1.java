package com.example.baekjoon.kyobo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 문자열 압축 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */
public class Problem1 {
    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.solution("aabbaccc"));
        System.out.println(problem1.solution("ababcdcdababcdcd"));
        System.out.println(problem1.solution("abcabcdede"));
        System.out.println(problem1.solution("abcabcabcabcdededededede"));
        System.out.println(problem1.solution("xababcdcdababcdcd"));
    }

    public int solution(String s) {
        int len = s.length() / 2;
        List<String> store = new ArrayList<>();
        for (int size = 1; size <= len; size++) {
            String target = s.substring(0, size);
            String sub = s.substring(size);
            StringBuilder candidate = new StringBuilder();
            int count = 1;
            while (sub.length() != 0) {
                while (sub.startsWith(target)) {
                    count++;
                    sub = sub.substring(size);
                }
                if (count != 1) {
                    candidate.append(count);
                    candidate.append(target);
                } else {
                    candidate.append(target);
                }
                if (sub.length() == 0) {
                    break;
                }
                if (target.length() > sub.length()) {
                    candidate.append(sub);
                    break;
                }
                target = sub.substring(0, size);
                count = 0;
            }
            store.add(candidate.toString());
            System.out.println(store);
        }
        return store.stream().min(Comparator.comparingInt(String::length)).map(String::length).orElse(s.length());
    }
}

