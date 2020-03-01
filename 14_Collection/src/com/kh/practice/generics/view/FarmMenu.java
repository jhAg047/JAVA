package com.kh.practice.generics.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	public void mainMenu() {
		System.out.println("========== KH ��Ʈ ==========");
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ���� �޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
				switch(menuNum) {
				case 1:adminMenu();break;
				case 2:customerMenu();break;
				case 9:System.out.println("���α׷� ����");break;
				default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
				}
			if(menuNum == 9) break;
		}
	}
	public void adminMenu() {
		while(true) {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. �� ��깰 �߰�");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ��깰 ���");
		System.out.println("9. �������� ���ư���");
		System.out.println();
		System.out.print("�޴� ��ȣ ���� : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		switch(menuNum) {
		case 1: addNewKind();break;
		case 2: removeKind();break;
		case 3: changeAmount();break;
		case 4: printFarm();break;
		case 9: ;break;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); 
		}
		if(menuNum == 9) break;
		}
	}
	public void customerMenu() {
		while(true) {
		System.out.println("���� KH��Ʈ ��깰 ����");
		printFarm();
		System.out.println("******* �� �޴� *******");
		System.out.println("1. ��깰 ���");
		System.out.println("2. ��깰 ����");
		System.out.println("3. ������ ��깰 ����");
		System.out.println("9. �������� ���ư���");
		System.out.println();
		System.out.print("�޴� ��ȣ ���� : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		switch(menuNum) {
		case 1: buyFarm();break;
		case 2: removeFarm();break;
		case 3: printBuyFarm();break;
		case 9: ;break;
		default: System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
		}
		if(menuNum == 9) break;
		}
	}
	public void addNewKind() {
		while(true) {
			Farm f = new Farm();
			System.out.println("1. ���� / 2. ä�� / 3. �߰�");
			System.out.print("�߰��� ���� ��ȣ : ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:case 2:case 3: break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); continue;
			}
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int amount = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1: f = new Fruit("����",name);break;
			case 2: f = new Vegetable("ä��",name);break;
			case 3: f = new Nut("�߰�",name);break;
			}
			if(fc.addNewKind(f, amount)) {
				System.out.println("�� ��깰�� �߰� �Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�, �ٽ� �Է����ּ���");
			}
		}
	}
	public void removeKind() {
		while(true) {
			Farm f = new Farm();
			System.out.println("1. ���� / 2. ä�� / 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:case 2:case 3:break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); continue;
			}
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			switch(num) {
			case 1:f = new Fruit("����",name);break;
			case 2:f = new Vegetable("ä��",name);break;
			case 3:f = new Nut("�߰�",name);break;
			}
			if(fc.removeKind(f)) {
				System.out.println("��깰 ������ �����Ͽ����ϴ�.");
				break;
			} else {
				System.out.println("��깰 ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	public void changeAmount() {
		while(true) {
		Farm f = new Farm();
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("������ ���� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:case 2:case 3: break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); continue;
		}
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("������ ���� : ");
		int newAmount = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:f = new Fruit("����",name);break;
		case 2:f = new Vegetable("ä��",name);break;
		case 3:f = new Nut("�߰�",name);break;
		}
		if(fc.changeAmount(f, newAmount)) {
			System.out.println("��깰 ������ �����Ǿ����ϴ�.");
			break;
		} else {
			System.out.println("��깰 ���� ������ �����Ͽ����ϴ�., �ٽ� �Է����ּ���");
		}
		}
	}
	public void printFarm() {
		Set<Farm> set = fc.printFarm().keySet();
		Iterator<Farm> it = set.iterator();
		while(it.hasNext()) {
			Farm key = it.next();
			System.out.println(key +"("+ fc.printFarm().get(key)+"��)");
		}
	}
	public void buyFarm() {
		while(true) {
		Farm f = new Farm();
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("���� ���� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:case 2:case 3:break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); continue;
		}
		System.out.print("������ �� : ");
		String name = sc.nextLine();
		switch(num) {
		case 1:f = new Fruit("����",name);break;
		case 2:f = new Vegetable("ä��",name);break;
		case 3:f = new Nut("�߰�",name);break;
		}
		if(fc.buyFarm(f)) {
			System.out.println("���ſ� �����Ͽ����ϴ�.");
			break;
		} else {
			System.out.println("��Ʈ�� ���� �����̰ų� ������ �����ϴ�. �ٽ� �Է����ּ���");
		}
		}
	}
	public void removeFarm() {
		while(true) {
			Farm f = new Farm();
			System.out.println("1. ���� / 2. ä�� / 3. �߰�");
			System.out.print("��� ���� ��ȣ : ");
			int renum = Integer.parseInt(sc.nextLine());
			switch(renum) {
			case 1:case 2:case 3:break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); continue;
			}
			System.out.print("���� ����� ��  : ");
			String name = sc.nextLine();
			switch(renum) {
			case 1:f = new Fruit("����",name);break;
			case 2:f = new Vegetable("ä��",name);break;
			case 3:f = new Nut("�߰�",name);break;
			}
			if(fc.removeFarm(f)) {
				System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
				break;
			} else {
				System.out.println("���� ��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	public void printBuyFarm() {
		Iterator<Farm> it = fc.printBuyFarm().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
