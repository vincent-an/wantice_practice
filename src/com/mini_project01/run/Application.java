package com.mini_project01.run;

import java.util.Scanner;

/**
 * 매일 발생하는 랜덤 이벤트를 해결하며 최대한 오래 살아남는 게임입니다.
 * 주요 기능:
 *
 * 캐릭터 생성 :
 * 사용자의 이름, 성별, 나이, 특징을 정한다.
 * 특징 : 스피드, 정신력, 힘, 수색능력
 *
 * 행동은 하루에 한 번, 진행할 수 있다.
 * 1. 수색하기
 * 2. 정비하기
 * 수색하기: 랜덤하게 아이템(식량, 약) 획득 또는 좀비 조우
 * - 수색하기 결과 : 식량 획득 - 30%, 약 획득 - 30%%, 무기 획득 - 20%, 좀비 조우 - 20%
 *
 * 정비하기: 체력 회복 및 장비 수리
 * - 정비하기 선택지
 * 1. 밥 - food 1 소비, 체력 회복
 *
 * 생존 상태 확인: 현재 허기, 체력, 허기, 생존 일수 출력 (DTO 활용)
 *
 * 포기하기: 생존 기록 저장 후 게임 종료
 */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User();

        System.out.println("============생존 게임 시작============");

        while (true) {
            System.out.println("==========메뉴==========");
            System.out.println("1. 캐릭터 생성");
            System.out.println("2. 수색하기");
            System.out.println("3. 정비하기");
            System.out.println("4. 상태 확인");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    user.setChar();
                    break;
                case 2 :
                    user.goSearch();
                    break;
                case 3:
                    user.goRest();
                    break;
                case 4:
                    user.status();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 된 번호를 작성했습니다.");
                    break;
            }

            if (num == 9) {
                break;
            }
        }
    }
}
