package com.module02.practice.controller;

import java.util.Scanner;

public class LoopPractice {

    public void practice1() {
        System.out.print("1이상의 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice2() {
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;

            } else {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
            }
            break;
        }
    }

    public void practice3(){
        System.out.print("1이상의 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice4() {
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;

            } else {
                for (int i = num; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            }
            break;
        }
    }

    public void practice5() {
        int sum = 0;
        System.out.print("정수를 하나 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for (int i = 1; i <= num; i++) {
                sum += i;
                if (i == num) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " + ");
                }
            }
            System.out.println("= " + sum);
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        if (num1 < 1 || num2 < 1) {
            System.out.println("1이상의 숫자만을 입력해주세요.");
        } else {
            for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            int num2 = sc.nextInt();

            if (num1 < 1 || num2 < 1) {
                System.out.println("1이상의 숫자만을 입력해주세요.");
                continue;

            } else {
                for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                    System.out.print(i + " ");
                }
            }
            break;
        }
    }

    public void practice8() {
        int multi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=======구구단 출력 프로그램입니다.======");
        System.out.print("숫자 : ");
        int num = sc.nextInt();

        System.out.println("====== " + num + "단 " + "=====");
        for (int i = 1; i < 10; i++) {
            multi = (num * i);
            System.out.println(num + " * " + i + " = " + multi);
        }
    }

    public void practice9() {
        int multi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=======구구단 출력 프로그램입니다.======");
        System.out.print("숫자 : ");
        int num = sc.nextInt();

        for (int i = num; i < 10; i++) {
            System.out.println("====== " + i + "단 " + "=====");
            for (int j = 1; j < 10; j++) {
                multi = (i * j);
                System.out.println(i + " * " + j + " = " + multi);
            }
        }
    }

    public void practice10() {
        int multi = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=======구구단 출력 프로그램입니다.======");
            System.out.print("숫자 : ");
            int num = sc.nextInt();

            if (num < 2 || num > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
                continue;
            } else {
                for (int i = num; i < 10; i++) {
                    System.out.println("====== " + i + "단 " + "=====");
                    for (int j = 1; j < 10; j++) {
                        multi = (i * j);
                        System.out.println(i + " * " + j + " = " + multi);
                    }
                }
            }
            break;
        }

    }

    public void practice11() {
        int[] num = new int[10];
        int sum = 0, gongCha = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 : ");
        num[0] = sc.nextInt();
        System.out.print("공차 : ");
        gongCha = sc.nextInt();

        for (int i = 1; i < num.length; i++) {
            num[i] = num[i-1] + gongCha;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        ;
    }

    public void practice12() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("연산자(+, -, *, /, %) : ");
            String operator = sc.nextLine();

            if (operator.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (!(operator.equals("+") || operator.equals("-") || operator.equals("*")
                    || operator.equals("/") || operator.equals("%"))) {
                System.out.println("없는 연산자입니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("정수 1 : ");
            int num1 = sc.nextInt();

            System.out.print("정수 2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();


            if (operator.equals("/") && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            int result = 0;
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                case "%" -> result = num1 % num2;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

    public void practice13() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("찾고자하는 문자 : ");
        char target = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("포함된 갯수 : " + count);
    }

    public void practice14() {
        int totalM = 0;
        int startM = 70;
        int i = 1;

        System.out.println("-------------------------");

        for (; totalM < 10000; i++) {
            totalM += startM;
            System.out.println(i + "회 모금액 : " + totalM + "원");
        }

        System.out.println("");
        System.out.println("총 모금횟수 : " + (i-1) + "회");
        System.out.println("-------------------------");
    }
}
