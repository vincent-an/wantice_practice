package com.module01;

import java.util.Scanner;

public class Module01_parc06 {
    public static void main(String[] args) {
        int kScore, mScore, eScore;

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력해주세요 : ");
        kScore = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        mScore = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        eScore = sc.nextInt();

        int sum = (kScore + mScore + eScore);
        double average = (sum / 3.0);

        System.out.println("총합 : " + sum);
        System.out.println("평균 점수 : " + average);

        if (average >= 60.0 && kScore >= 40 && mScore >= 40 && eScore >= 40) {
            System.out.println("==합격==");
        } else {
            System.out.println("==불합격==");
        }
    }
}
