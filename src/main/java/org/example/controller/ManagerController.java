package org.example.controller;

import org.example.service.ManagerService;
import org.example.service.ManagerServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class ManagerController {

    // 메뉴 선택 함수
    public void menu(LocalDate today) {
        Scanner scanner = new Scanner(System.in);
        ManagerService managerService = new ManagerServiceImpl();

        while (true) {
            System.out.println();
            try {
                printMenu();
                String input = scanner.nextLine().trim();
                int userSelection = Integer.parseInt(input); // 사용자가 선택한 메뉴의 번호를 받는 변수
                if (userSelection == 1) {
                    managerService.accountSearch();
                } else if (userSelection == 2) {
                    managerService.showAccountList();
                } else if (userSelection == 3) {
                    managerService.showAccountHistory(today);

                } else if(userSelection==4){
                    break;
                }else {
                    System.out.println("1-4 사이의 수를 입력하세요");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 1-4 사이의 수를 입력하세요.");
            }
        }
        return;
    }

    // 메뉴 프린트 함수
    public void printMenu() {
        System.out.println("---------------------");
        System.out.println("   BankU");
        System.out.println("---------------------");
        System.out.println("1) 계좌 검색");
        System.out.println("2) 계좌 목록 조회");
        System.out.println("3) 기간 별 계좌 조회");
        System.out.println("4) 관리자 모드 종료");
        System.out.println("---------------------");
        System.out.println("메뉴 번호를 입력하세요!");
    }
}