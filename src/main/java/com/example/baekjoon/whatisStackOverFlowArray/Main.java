package com.example.baekjoon.whatisStackOverFlowArray;

import java.util.Scanner;

public class Main {
    static String[] s = new String[6];

    public static void whatIs(String str, int count){
        if (count ==0){
            System.out.println(str +s[0]+str+s[4]);
        }else {
            System.out.println(str +s[0]+str +s[1]+str+s[2]+str+s[3]);
            whatIs(str.concat("____"), count -1);
        }
        System.out.println(str +s[5]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        s[0] = "\"재귀함수가 뭔가요?\"\n";
        s[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        s[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        s[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        s[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        s[5] = "라고 답변하였지.\n";

        whatIs("",num);
    }
}
