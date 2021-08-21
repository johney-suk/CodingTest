package com.example.baekjoon.greedy.meetingroom;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

//https://st-lab.tistory.com/145

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] time = new int[N][2];

        for(int i = 0; i < N; i++) {
            time[i][0] = scanner.nextInt();	// 시작시간
            time[i][1] = scanner.nextInt();	// 종료시간
        }

        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {
//        Arrays.sort(time, (o1, o2) -> {

            @Override
            public int compare(int[] o1, int[] o2) {
// 같다면 시작시간 빠른걸로 sort
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
//        Arrays.sort(time, (o1, o2) -> {
//            if(o1[1] == o2[1]) {
//                return o1[0] - o2[0];
//            }
//            return o1[1] - o2[1];
//        });

        int count = 0;
        int prev = 0;

        for(int i = 0; i < N; i++) {

            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if(prev <= time[i][0]) {
                prev = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}