package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		int num =0;
		do {
		System.out.println("1. ���� ���ڿ�");
		System.out.println("2. �Է� ���ڿ�");
		System.out.println("3. ���α׷� ������");
		num = sc.nextInt();
		switch(num) {
		case 1:tokenMenu();break;
		case 2:inputMenu();break;
		case 3:
			System.out.println("���α׷��� �����մϴ�.");
			return;
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		}while(num != 3);
	}
	public void tokenMenu() {
		String str="J a v a P r o g r a m";
		System.out.println("��ū ó�� �� ���� : "+ str);
		System.out.println("��ū ó�� �� ���� : "+str.length());
		System.out.println("��ū ó�� �� ���� : "+tc.afterToken(str));
		System.out.println("��ū ó�� �� ���� : "+tc.afterToken(str).length());
		System.out.println("��� �빮�ڷ� ��ȯ : "+ tc.afterToken(str).toUpperCase());
	}
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str1 = sc.next();
		tc.firstCap(str1);
		System.out.println("ù ���� �빮�� : ");
		System.out.println("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		
	}
}
