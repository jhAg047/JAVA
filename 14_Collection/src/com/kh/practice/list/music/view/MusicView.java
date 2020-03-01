package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		int num;
		do {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ���� ����");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ������ �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� :");
		num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:addList();break;
		case 2:addAtZero();break;
		case 3:printAll();break;
		case 4:searchMusic();break;
		case 5:removeMusic();break;
		case 6:setMusic();break;
		case 7:ascTitle();break;
		case 8:descSinger();break;
		case 9 : 
			System.out.println("����");return;
		default: 
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
		}while(num != 9);
	}
	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		if(mc.addList(music) == 1) {
			System.out.println("�߰� ����");
		}
	}
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		if(mc.addAtZero(music) == 1) {
			System.out.println("�߰� ����");
		}
		
	}
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		System.out.println(mc.printAll());
	}
	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}
	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		System.out.println(mc.removeMusic(title) + "��(��) �����߽��ϴ�.");
		
	}
	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ����  ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� : ");
		String setTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(setTitle,singer);
		System.out.println(mc.setMusic(title, music) + "�� ���� ���� �Ǿ����ϴ�.");
	
	}
	public void ascTitle() {
		System.out.println("****** �� �� �������� ���� ******");
		if(mc.ascTitle() == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
	public void descSinger() {
		System.out.println("****** ���� �� �������� ���� ******");
		if(mc.descSinger() == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}
