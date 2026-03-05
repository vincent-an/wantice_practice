package com.module02.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 수정\n2. 조회\n3. 삭제\n4. 종료");
        System.out.println("====================");
        System.out.print("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("수정 메뉴입니다.");
                break;
            case 2:
                System.out.println("조회 메뉴입니다.");
                break;
            case 3:
                System.out.println("삭제 메뉴입니다.");
                break;
            case 4:
                System.out.println("프로그램이 종료됩니다..");
                break;
        }
        if (num > 4) {
            System.out.println("잘못된 값입니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 한 개 입력하세요: ");
        int num = sc.nextInt();

        if (num <= 0 ) {
            System.out.println("양수만 입력해주세요.");
        } else if (num % 2 == 0) {
            System.out.println("양수다");
        } else {
            System.out.println("음수다");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수: ");
        int kScore = sc.nextInt();
        System.out.print("수학점수: ");
        int mScore = sc.nextInt();
        System.out.print("영어점수: ");
        int eScore = sc.nextInt();

        int sum = kScore + mScore + eScore;
        double aver = (kScore + mScore + eScore) / 3.0;

        if (aver >= 60.0 && kScore >= 40 && mScore >= 40 && eScore >= 40) {
            System.out.println("국어점수: " + kScore);
            System.out.println("수어점수: " + mScore);
            System.out.println("영어점수: " + eScore);
            System.out.println("합계: " + sum);
            System.out.println("평균: " + aver);
            System.out.println("축하합니다. 합격입니다!");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    public void practice4() {
        String season;
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12 사이의 정수 입력 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1,2,12 :
                season = "겨울";
                System.out.println(num + "월은 " + season + "입니다.");
                break;
            case 3,4,5 :
                season = "봄";
                System.out.println(num + "월은 " + season + "입니다.");
                break;
            case 6,7,8 :
                season = "여름";
                System.out.println(num + "월은 " + season + "입니다.");
                break;
            case 9,10,11 :
                season = "가을";
                System.out.println(num + "월은 " + season + "입니다.");
                break;
        }
        if (num > 12) {
            System.out.println("잘못 입력된 값");
        }
    }

    public void practice5() {
        String id = "vincent";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        String checkId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String checkPass = sc.nextLine();

        if (checkId.equals(id)) {
            if (checkPass.equals(password)) {
                System.out.println("로그인 성공!");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("관리자, 회원, 비회원");
        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        String rank = sc.nextLine();

        switch (rank) {
            case "관리자" :
                auth1();
                auth2();
                auth3();
                break;
            case "회원" :
                auth2();
                auth3();
                break;
            case "비회원" :
                auth3();
                break;
        }
        if (!(rank.equals("관리자") || rank.equals("회원") || rank.equals("비회원"))) {
            System.out.println("잘못 입력했습니다.");
        }
    }

    public void practice7() {
        double length, weight, bmi;

        Scanner sc = new Scanner(System.in);
        System.out.print("키(m)를 입력해 주세요. : ");
        length = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력해 주세요. : ");
        weight = sc.nextDouble();

        bmi = weight / (length * length);
        System.out.println("BMI 지수 : " + bmi);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("비만");
        } else {
            System.out.println("비만");
        }

    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자1 입력(양수) : ");
        int num1 =  sc.nextInt();

        System.out.print("피연산자2 입력(양수) : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        // nextInt() 사용시 사용자의 입력값과 엔터를 누르면, ex: 10\n이 저장되고, int값만 가져오기 때문에
        // \n이 버퍼에 남아있다. 그 다음 scanner에서 \n 전까지 받아오는데 \n이 남아있어 입력값을 안받고 바로 넘어감!

        System.out.print("연산자를 입력(+,-,*,/,%) : ");
        String operater = sc.nextLine();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("피연산자는 양수로 입력해주세요. 프로그램을 종료합니다.");
        }

        switch (operater) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case  "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case "%":
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
        }
        if (!(operater.equals("+") || operater.equals("-") || operater.equals("*")
                || operater.equals("/") || operater.equals("%"))) {
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }

    }

    public void practice9() {
        double mScore, fScore, asScore, atScore, totalScore;
        String status = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("중간고사 점수 : ");
        int mExam = sc.nextInt();
        scoreError(mExam);

        System.out.print("기말고사 점수 : ");
        int fExam = sc.nextInt();
        scoreError(fExam);

        System.out.print("과제 점수 : ");
        int assign = sc.nextInt();
        scoreError(assign);

        System.out.print("출석 횟수(총 20) : ");
        int attend = sc.nextInt();
        sc.nextLine();
        attendError(attend);

        mScore = mExam * 0.2;
        fScore = fExam * 0.3;
        asScore = assign * 0.3;
        atScore = attend;
        totalScore =  mScore + fScore + asScore + atScore;

        if (totalScore > 70 && attend >= 14) { // pass
            status = "PASS";
        } else if (totalScore < 70 && attend < 14) { // 둘다 false
            status = "FAIL1";
        } else if (totalScore < 70 && attend >= 14) { // 총점 fail
            status = "FAIL2";
        } else if (totalScore > 70 && attend < 14) { // 출석 fail
            status = "FAIL3";
        } else {
            System.out.println("알 수 없는 에러 발생.");
        }

        System.out.println("===========결과==========");
        switch (status) {
            case "PASS":
                System.out.println("중간고사 점수(20) : " + mScore);
                System.out.println("기말고사 점수(30) : " + fScore);
                System.out.println("과제 점수(30) : " + asScore);
                System.out.println("출석 점수(20) : " + atScore);
                System.out.println("총점 : " + totalScore);
                System.out.println(status);
                break;
            case "FAIL1":
                System.out.println("FAIL [점수 미달] (총점 " + totalScore + ")");
                System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
                break;
            case "FAIL2":
                System.out.println("FAIL [점수 미달] (총점 " + totalScore + ")");
                break;
            case "FAIL3":
                System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
                break;
        }
    }

    public void menuView(){
        Scanner sc = new Scanner(System.in);
        System.out.println("실행할 기능을 선택하세요.");
        System.out.println("1. 메뉴 출력");
        System.out.println("2. 짝수/홀수");
        System.out.println("3. 합격/불합격");
        System.out.println("4. 계절");
        System.out.println("5. 로그인");
        System.out.println("6. 권한 확인");
        System.out.println("7. BMI");
        System.out.println("8. 계산기");
        System.out.println("9. 점수 결과 출력");
        System.out.print("선택 : ");
        int num = sc.nextInt();
        sc.nextLine();

        switch (num) {
            case 1:
                practice1();
                break;
            case 2:
                practice2();
                break;
            case 3:
                practice3();
                break;
            case 4:
                practice4();
                break;
            case 5:
                practice5();
                break;
            case 6:
                practice6();
                break;
            case 7:
                practice7();
                break;
            case 8:
                practice8();
                break;
            case 9:
                practice9();
                break;
        }
        if (num < 1 || num > 9) {
            System.out.println("제대로된 번호를 입력해주세요.");
        }

    }


    // ===== 내부 참조 메서드 ======
    public void auth1() {
        System.out.println("회원관리, 게시글 관리");
    }
    public void auth2() {
        System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
    }
    public void auth3() {
        System.out.println("게시글 조회");
    }
    public void scoreError(int score) {
        if (score < 0 || score > 100) {
            System.out.println("점수는 0 ~ 100 사이로 입력해주세요.");
        }
    }
    public void attendError(int attend) {
        if (attend < 0 || attend > 20) {
            System.out.println("출석 일수는 0 ~ 20 사이로 입력해주세요.");
        }
    }
}
