package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		//File 객체 생성
		try {
		File f1 = new File("test.txt");
		f1.createNewFile(); //createNewFile() : 파일만 생성
		
		File f2 = new File("c:/test/test.txt");
		f2.createNewFile();
		
		File f3 = new File("c:\\temp3\\temp2");
		File f4 = new File("c:\\temp3\\temp2\\test.txt");
		f4.createNewFile();
		f3.mkdirs(); // mkdirs() : 폴더 만들기
		f4.delete(); // delete() : 파일 삭제
		
		System.out.println(f2.exists()); // true / exists() : 파일이든 폴더든 존재를 확인
		System.out.println(f3.exists()); // true
		System.out.println(f3.isFile()); // false / isFile() : 파일인지 아닌지 확인
		
		//그 외의 메소드들 
		System.out.println("파일 명 : " + f1.getName());
		System.out.println("저장 절대 경로 : "+ f1.getAbsolutePath());
		System.out.println("저장 상대 경로 : "+ f1.getPath());
		System.out.println("파일 용량 : "+ f1.length());
		System.out.println("파일 용량 : "+ f2.length());
		System.out.println("f1 상위 폴더 : " + f1.getParent());
		System.out.println("f4 상위 폴더 : " + f4.getParent());
		// 저장 절대 경로 - 절대적인 경로 내가 어디 있든지간에 바뀌지 않는 경로
		// 저장 상대 경로 - 지금 내 위치가 어디 있는지에 따라 바뀌는 경로
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
