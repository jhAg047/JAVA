package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
	}
	public void selectAll() {
		
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
	}
}
