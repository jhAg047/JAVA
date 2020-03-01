package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH ��÷ ���α׷� ==========");
		int num = 0;
		do {
		System.out.println("=====***** ���� �޴� *****=====");
		System.out.println("1. ��÷ ��� �߰�");
		System.out.println("2. ���� ��� ����");
		System.out.println("3. ��÷ ��� Ȯ��");
		System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
		System.out.println("5. ��÷ ��� �˻�");
		System.out.println("9. ����");
		System.out.println();
		System.out.print("�޴���ȣ �Է� : ");
		num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:insertObject();break;
		case 2:deleteObject();break;
		case 3:winObject();break;
		case 4:sortedWinObject();break;
		case 5:searchWinner();break;
		case 9: System.out.println("���α׷� ����"); return;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
		}
		}while(num != 9);
	}
	public void insertObject() {
		int num = 0;
		String name;
		String phone;
		System.out.print("�߰��� ��÷ ��� �� : ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<num;i++) {
			System.out.print("�̸� : ");
			name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			phone = sc.nextLine();
			System.out.println();
			Lottery l = new Lottery(name,phone);
			if(lc.insertObject(l)) {
				
			} else {
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է����ּ���");
				i--;
			}
		}
		System.out.printf("%d�� �߰� �Ϸ�Ǿ����ϴ�.\n",num);
	}
	public void deleteObject() {
		String name;
		String phone;
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		phone = sc.nextLine();
		Lottery l = new Lottery(name,phone);
		if(lc.deleteObject(l)) {
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
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
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name,phone);
		if(lc.searchWinner(l)) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		} else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
	}
}
