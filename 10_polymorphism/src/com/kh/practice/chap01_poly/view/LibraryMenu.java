package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("==== �޴� ====");
		System.out.println("1. ����������");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� �뿩�ϱ�");
		System.out.println("9. ���α׷� �����ϱ�");
		System.out.println("�޴� ��ȣ : ");
		int num = sc.nextInt();
	}
	public void selectAll() {
		
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
	}
}
