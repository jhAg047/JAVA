package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		// �� exit�� ������ �ݺ� ����
		/*
		 	���ڿ� �Է� : �ȳ��ϼ���
		 	str : �ȳ��ϼ���
		 	���ڿ� �Է�: apple
		 	str : apple
		 	���ڿ� �Է� : exit
		 	str : exit
		 */
		Scanner sc = new Scanner(System.in);
		//1.while
		//String str = null; //null : �ƹ��͵� �ƴ� �� �ٵ� �̷��� �ϸ� ������
//		String str = ""; //�̷��� �ؾ���
//		while(!str.equals("exit")) {	//str�� �� equals()
//			System.out.print("���ڿ� �Է� : ");
//		str = sc.nextLine();
//		System.out.println("str : "+str);
//		}
		//do ~ while 
		//String str = "";
		String str = null; //�ѹ� ������ ���¿��� do~while������ ���� �ȳ�
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : "+str);
		} while(!str.equals("exit"));
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
		System.out.println("1. �׽�Ʈ 1");
		System.out.println("2. �׽�Ʈ 2");
		System.out.println("3. �׽�Ʈ 3");
		System.out.println("9. ����");
		System.out.print("�޴����� : ");
		menuNum = sc.nextInt();
		switch(menuNum) {
		case 1: System.out.println(1);break;
		case 2: System.out.println(2);break;
		case 3 :System.out.println(3);break;
		case 9 :System.out.println("�����մϴ�");break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} 
	} while (menuNum != 9);
	}
}
