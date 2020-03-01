package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH ����Ʈ ==========");
		int num =0;
		do {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ���� �̸� ȸ�� ã��");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� : ");
		num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:joinMembership();break;
		case 2:logIn();break;
		case 3:sameName();break;
		case 9:System.out.println("���α׷� ����.");return;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
		}
		}while(num != 9);
	}
	public void memberMenu() {
		int num1 = 0;
		do {
		System.out.println("******* ȸ�� �޴� *******");
		System.out.println("1. ��й�ȣ �ٲٱ�");
		System.out.println("2. �̸� �ٲٱ�");
		System.out.println("3. �α׾ƿ�");
		System.out.print("�޴� ��ȣ ���� : ");
		num1 = sc.nextInt();
		sc.nextLine();
		switch(num1) {
		case 1:changePassword();break;
		case 2:changeName();break;
		case 3:System.out.println("�α׾ƿ� �Ǿ����ϴ�.");return;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
		}
		}while(num1 != 3);
	}
	public void joinMembership() {
		while(true) {
		String id;
		String name;
		String pwd;
		
		System.out.print("���̵� : ");
		id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		pwd = sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		Member m = new Member(pwd,name);
		if(mc.joinMembership(id, m)) {
			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
			break;
		} else {
			System.out.println("�ߺ��� ���̵� �Դϴ�. �ٽ� �Է����ּ���");
		}
		}
	}
	public void logIn() {
		while(true) {
		String id;
		String pwd;
		System.out.print("���̵� : ");
		id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		pwd = sc.nextLine();
		if(mc.logIn(id, pwd) != null) {
			System.out.printf("%s��, ȯ���մϴ�!\n",mc.logIn(id, pwd));
			memberMenu();
			break;
		} else {
			System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ �Դϴ�. �ٽ� �Է����ּ���");
		}
		}
	}
	public void changePassword() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("���� ��й�ȣ : ");
			String oldPw = sc.nextLine();
			System.out.print("���ο� ��й�ȣ : ");
			String newPw = sc.nextLine();
			if(mc.changePassword(id, oldPw, newPw)) {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
				break;
			} else {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	public void changeName() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String pwd = sc.nextLine();
			if(mc.logIn(id, pwd) != null) {
				System.out.println("���� ������ �̸� :" + mc.logIn(id, pwd));
				System.out.print("������ �̸� : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				System.out.println("�̸� ���濡 �����Ͽ����ϴ�.");
				break;
			} else {
				System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	public void sameName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		Set<Entry<String,String>> set2 = mc.sameName(name).entrySet();
		Iterator<Entry<String,String>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String,String> entry = it2.next();
			System.out.println(entry.getValue()+" - " + entry.getKey());
		}
	}
}
