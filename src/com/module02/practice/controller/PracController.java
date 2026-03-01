package com.module02.practice.controller;

import java.util.Scanner;

public class PracController {

    public void practice1() {
        String name ="";
        int age= 0;
        String gender = "";
        double height = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        name = sc.nextLine();

        System.out.println("나이를 입력해주세요 : ");
        age = sc.nextInt();
        if (height < 0) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.println("성별을 입력해주세요(남/여) : ");
        gender = sc.nextLine();
        if (!(gender.equals("남") || gender.equals("여"))) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.println("키를 입력해주세요(cm) : ");
        height = sc.nextInt();
        if (height < 1) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.println("키 " + height + "인 " + gender + "자 " + name + "님 반갑습니다^^");
    }

    public void practice2() {
        String str1 = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        str1 = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 문자 : " + str1.charAt(i));
        }
    }

    public void practice3() {
        String name ="";
        int grade, cls, num = 0;
        String gender = "";
        double score = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        name = sc.nextLine();

        System.out.print("학년을 입력해주세요(숫자만) : ");
        grade = sc.nextInt();
        if (grade < 1) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.print("반을 입력해주세요(숫자만) : ");
        cls = sc.nextInt();
        if (cls < 1) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.print("번호를 입력해주세요(숫자만) : ");
        num = sc.nextInt();
        sc.nextLine();
        if (num < 1) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.print("성별을 입력해주세요(M/F) : ");
        gender = sc.nextLine();
        if (gender.equals("m") || gender.equals("M")) {
            gender = "남학생";
        } else if (gender.equals("f") || gender.equals("F")) {
            gender = "여학생";
        } else {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }

        System.out.print("성적을 입력해주세요. (소수점 아래 둘째 자리까지) : ");
        score = sc.nextDouble();
        if (score < 0) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        }  else if (String.valueOf(score).split("\\.")[1].length() > 2) {
            System.out.println("소수점 아래 둘째 자리까지만 입력 가능합니다.");
        }

        System.out.println(grade + "학년 " + cls + "반 " + num + "번 " + name + " " + gender + "의 성적은 " + score + "이다.");
    }

    public void practice4() {
        String Rnum, gender = "";
        char genderNum;

        Scanner sc = new Scanner(System.in);
        Rnum = sc.nextLine();

        genderNum = Rnum.charAt(9);

        switch (genderNum) {
            case 1,3,5,7,9 :
                gender = "남자";
                break;
            case 2,4,6,8,10 :
                gender = "여자";
                break;
        }
        System.out.println("당신은 " + gender + "입니다.");
    }

    public void practice5() {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length - 1; i++) {
            System.out.print("정수" + (i+1) + " : ");
            num[i] = sc.nextInt();
        }

        System.out.print("비교값 : ");
        num[2] = sc.nextInt();

        if (num[2] <= num[0] || num[2] > num[1]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void practice6() {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length - 1; i++) {
            System.out.print("정수" + (i+1) + " : ");
            num[i] = sc.nextInt();
        }

        if (num[0] == num[1] && num[0] == num[2] ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void practice7() {
        double score = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        score = sc.nextDouble();

        if (score >= 90.00 && score < 100) {
            System.out.println("축하합니다.");
        } else {
            System.out.println("분발하세요.");
        }
    }
}
