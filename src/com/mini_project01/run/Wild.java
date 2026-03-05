package com.mini_project01.run;

import com.mini_project01.dto.UserDTO;

import java.util.Random;
import java.util.Scanner;

public class Wild {

    int food = 0;
    Scanner sc = new Scanner(System.in);
    UserDTO userDTO = new UserDTO();

    public void setChar() {

        if (userDTO.getLiving() == false) {
            System.out.println("======= 캐릭터를 생성합니다... ======");
            System.out.print("당신의 이름은? : ");
            String name = sc.nextLine();
            userDTO.setName(name);

            System.out.print("당신의 성별은? (남자/여자) : ");
            String gender = sc.nextLine();
            userDTO.setGender(gender);

            System.out.print("당신의 특징을 선택해주세요. [스피드, 정신력, 힘, 수색능력] : ");
            String ability = sc.nextLine();
            userDTO.setAbility(ability);

            System.out.println("캐릭터 생성이 완료되었습니다.");
            userDTO.setLiving(true);
            userDTO.setFood(food);
            userDTO.setLife(3);
        } else {
            System.out.println("당신은 생존 중에 있습니다...");
        }
    }

    public void search() {
        if (userDTO.getLiving() == false) {
            System.out.println("먼저 캐릭터를 생성해야 합니다.");
        } else {
            System.out.println("주변 수색을 시작합니다...");

            Random random = new Random();
            int chance = random.nextInt(100);

            if (chance < 60) {
                System.out.println("[식량 획득] 유통기한이 지나지 않은 통조림을 발견했습니다! ");
                userDTO.setFood(userDTO.getFood() + 1);
            } else if (chance < 99) {
                System.out.println("[좀비 발견] 싀발 좀비를 발견했습니다! 전투에 들어갑니다.");
                battle();
            }
        }

    }

    private void battle() {
        Random random = new Random();
        int actionChance = random.nextInt(100);

        System.out.println("[좀비 발견] " + userDTO.getName() + ": 어...! 시발 좀비다.... 잠만 종민이를 닮았는데?");
        System.out.println("[System] 좀비를 발견했습니다. 전투에 들어갑니다.");
        System.out.print("[System] 행동을 정해주세요 [1. 공격하기 2. 도망가기]: ");
        int actionNum = sc.nextInt();
        System.out.println("[System] " + actionNum + "번을 선택하였습니다.");
        if (actionNum == 1) {
            if (actionChance < 70) {
                System.out.println("[System] 공격 성공!!! 좀비를 물리쳤습니다.. 종민아 미안해...");
                System.out.println("[System] 집으로 돌아갑니다...");
            } else {
                System.out.println("[System] 공격 실패... 좀비 종민에게 공격당했습니다.");
                System.out.println("[System] 체력이 감소합니다.. 종민아 아프다...");
                System.out.println("[System] 다행히 종민이가 존나 약해 체력이 1 깎입니다.");
                userDTO.setLife(userDTO.getLife() - 1);
                System.out.println("[System] 현재 체력 : " + userDTO.getLife());
            }
        }
    }

    public void rest() {
        if (userDTO.getLiving() == false) {
            System.out.println("먼저 캐릭터를 생성해야 합니다.");
        } else {
            System.out.println("[휴식] 휴식을 취합니다...");
            System.out.println("진강(태연맘) : 밥먹자 " + userDTO.getName() + "이야~~~");
            System.out.println(userDTO.getName() + ": 네~~~~~");
            if (userDTO.getLife() == 10) {
                System.out.println("회복할 체력이 없습니다... 다시 메뉴 선택창으로 넘어갑니다.");
            } else {
                System.out.println("[체력 회복] 체력을 회복합니다+++++");
                System.out.println("[체력 회복 중] Loding....");
                System.out.println("[체력 회복 중] Loding....");
                System.out.println("[체력 회복 중] Loding....");
                userDTO.setLife(userDTO.getLife() + 1);
                System.out.println("체력 회복 완료, 현재 체력: " + userDTO.getLife());
            }
        }
    }

    public void getStatus() {
        if (userDTO.getLiving() == false) {
            System.out.println("먼저 캐릭터를 생성해야 합니다.");
        } else {
            System.out.println("[System] 현재 상태를 확인합니다.");
            System.out.println("현재 상태 : " + userDTO.toString());
        }
    }
}
