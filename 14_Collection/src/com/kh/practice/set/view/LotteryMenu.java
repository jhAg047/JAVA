package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		int num = 0;
		do {
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추점 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.println();
		System.out.print("메뉴번호 입력 : ");
		num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:insertObject();break;
		case 2:deleteObject();break;
		case 3:winObject();break;
		case 4:sortedWinObject();break;
		case 5:searchWinner();break;
		case 9: System.out.println("프로그램 종료"); return;
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		}
		}while(num != 9);
	}
	public void insertObject() {
		int num = 0;
		String name;
		String phone;
		System.out.print("추가할 추첨 대상 수 : ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<num;i++) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("핸드폰 번호('-'빼고) : ");
			phone = sc.nextLine();
			System.out.println();
			Lottery l = new Lottery(name,phone);
			if(lc.insertObject(l)) {
				
			} else {
				System.out.println("중복된 대상입니다. 다시 입력해주세요");
				i--;
			}
		}
		System.out.printf("%d명 추가 완료되었습니다.\n",num);
	}
	public void deleteObject() {
		String name;
		String phone;
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		phone = sc.nextLine();
		Lottery l = new Lottery(name,phone);
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	public void winObject() {
		System.out.println(lc.winObject());
	}
	public void sortedWinObject() {
		Iterator<Lottery> it = lc.sortWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name,phone);
		if(lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
