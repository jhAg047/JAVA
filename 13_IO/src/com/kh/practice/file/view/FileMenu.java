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
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기 ");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		num = sc.nextInt();
		switch(num) {
		case 1:fileSave();break;
		case 2:fileOpen();break;
		case 3:fileEdit();break;
		case 9:
			System.out.println("프로그램을 종료합니다.");return;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		}while(num == 9);
		
	}
	public void fileSave() {
		String s ="";
		String fileName ="";
		char ch =' ';
		StringBuilder sb = new StringBuilder();
		do {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다");
		System.out.print("내용 : ");
		s = sc.nextLine();
		sb.append(s+"\n");
		}while(!s.equals("ex끝it"));
		do {
		System.out.println("저장할 파일 명을 입력해주세요(ex.myFile.txt) : ");
		fileName = sc.nextLine();
		if(fc.checkName(fileName)) {
			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
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
		System.out.println("열 파일 명");
		s = sc.nextLine();
		fc.checkName(s);
		if(fc.checkName(s) == true) {
			System.out.println();
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	public void fileEdit() {
		String s ="";
		System.out.println("수정할 파일명 : ");
		s = sc.nextLine();
		fc.checkName(s);
		if(fc.checkName(s) == true) {
			
		}
	}
}
