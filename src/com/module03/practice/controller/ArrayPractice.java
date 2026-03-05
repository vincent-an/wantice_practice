package com.module03.practice.controller;

import java.util.Scanner;

public class ArrayPractice {
    Scanner sc = new Scanner(System.in);

    public void practice1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public void practice2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
            System.out.print(array[i] + " ");
        }
    }

    public void practice3() {
        System.out.print("양의 정수 : ");
        int num =  sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public void practice4() {
        String[] array = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(array[1]);
    }

    public void practice5() {
        System.out.print("문자열 : ");
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for (char c : array) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println(ch + "의 개수 : " + count);

    }

    public void practice6() {
        String[] day ={"월", "화", "수", "목", "금", "토", "일"};
        System.out.print("0 ~ 6 사이 숫자 입력 : ");
        int num = sc.nextInt();

        if (num < 0 || num > 6) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            System.out.println(day[num] + "요일");
        }
    }

    public void practice7() {
        int sum = 0;
        String numArray = "";
        System.out.print("배열의 길이(정수) : ");
        int num = sc.nextInt();
        sc.nextLine();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            int index = sc.nextInt();
            array[i] = index;
            sum += index;
            numArray += array[i] + " ";
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("");
        System.out.println(numArray);
        System.out.println("총 합 : " + sum);

    }

    public void practice8() {
        String answer = "";
        System.out.print("정수 : ");
        int num = sc.nextInt();

        if (num % 2 == 0 || num < 3) {
            System.out.println("다시 입력하세요.");
        } else {
            int[] array = new int[num];

            for (int i = 0; i < array.length; i++) {
                if (i <= (array.length / 2)) {
                    array[i] = i + 1;
                    answer += array[i] + " ";
                } else {
                    array[i] = array[i-1] - 1;
                    answer += array[i] + " ";
                }
            }
            System.out.println(answer);
        }
    }

    public void practice9() {
        Boolean isExist = false;
        String[] str = {"양념", "프라이드", "간장", "쉬림프", "마늘", "파닭", "뿌링클"};
        System.out.print("치킨 이름을 입력하세요 : ");
        String chicken = sc.nextLine();

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(chicken)) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            System.out.println(chicken + "치킨 배달 가능");
        } else {
            System.out.println(chicken + "치킨은 없는 메뉴입니다.");
        }
    }

    public void practice10() {
        int[] array = new int[10];
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            int randomNum = (int)(Math.random() * 10) + 1;
            array[i] = randomNum;
            answer += array[i] + " ";
        }

        System.out.println(answer);
    }

    public void practice11() {
        String answer = "";

        System.out.print("주민등록번호(-포함) : ");
        String num = sc.nextLine();
        char[] chars1 = num.toCharArray();
        char[] chars2 = new  char[chars1.length];

        for (int i = 0; i < chars2.length; i++) {
            if (i > 7) {
                chars2[i] = '*';
                answer += chars2[i] + "";
            } else {
                chars2[i] = chars1[i];
                answer += chars2[i] + "";
            }
        }

        System.out.println(answer);
    }
}
