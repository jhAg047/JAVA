package com.kh.practice.file.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		int num = 0;
		do {
		System.out.println("***** My Note *****");
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ���� ");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		num = sc.nextInt();
		switch(num) {
		case 1:fileSave();break;
		case 2:fileOpen();break;
		case 3:fileEdit();break;
		case 9:
			System.out.println("���α׷��� �����մϴ�.");return;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
		}while(num == 9);
		
	}
	public void fileSave() {
		String s ="";
		String fileName ="";
		char ch =' ';
		StringBuilder sb = new StringBuilder();
		do {
		System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
		System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�");
		System.out.print("���� : ");
		s = sc.nextLine();
		sb.append(s+"\n");
		}while(!s.equals("ex��it"));
		do {
		System.out.println("������ ���� ���� �Է����ּ���(ex.myFile.txt) : ");
		fileName = sc.nextLine();
		if(fc.checkName(fileName)) {
			System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n)");
			ch = sc.next().charAt(0);
			if(ch == 'y') {
				fc.fileSave(fileName, sb);
				break;
			}
		}else {
			fc.fileSave(fileName, sb);
		}
		}while(ch == 'y');
	}
	public void fileOpen() {
		String s ="";
		System.out.println("�� ���� ��");
		s = sc.nextLine();
		fc.checkName(s);
		if(fc.checkName(s) == true) {
			System.out.println();
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}
	public void fileEdit() {
		String s ="";
		System.out.println("������ ���ϸ� : ");
		s = sc.nextLine();
		fc.checkName(s);
		if(fc.checkName(s) == true) {
			
		}
	}
}
