package com.module01;

import java.util.Scanner;

public class Module01_prac05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요 : ");
        int age = sc.nextInt();
//        sc.nextLine();

        if (age > 19) {
            System.out.println("성인");
        } else if (age <= 13 && age > 0) {
            System.out.println("어린이");
        } else if (age <= 0) {
            System.out.println("잘못된 값입니다.");
        } else {
            System.out.println("청소년");
        }
    }
}
