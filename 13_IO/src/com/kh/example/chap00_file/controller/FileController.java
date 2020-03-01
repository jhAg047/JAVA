package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		//File ��ü ����
		try {
		File f1 = new File("test.txt");
		f1.createNewFile(); //createNewFile() : ���ϸ� ����
		
		File f2 = new File("c:/test/test.txt");
		f2.createNewFile();
		
		File f3 = new File("c:\\temp3\\temp2");
		File f4 = new File("c:\\temp3\\temp2\\test.txt");
		f4.createNewFile();
		f3.mkdirs(); // mkdirs() : ���� �����
		f4.delete(); // delete() : ���� ����
		
		System.out.println(f2.exists()); // true / exists() : �����̵� ������ ���縦 Ȯ��
		System.out.println(f3.exists()); // true
		System.out.println(f3.isFile()); // false / isFile() : �������� �ƴ��� Ȯ��
		
		//�� ���� �޼ҵ�� 
		System.out.println("���� �� : " + f1.getName());
		System.out.println("���� ���� ��� : "+ f1.getAbsolutePath());
		System.out.println("���� ��� ��� : "+ f1.getPath());
		System.out.println("���� �뷮 : "+ f1.length());
		System.out.println("���� �뷮 : "+ f2.length());
		System.out.println("f1 ���� ���� : " + f1.getParent());
		System.out.println("f4 ���� ���� : " + f4.getParent());
		// ���� ���� ��� - �������� ��� ���� ��� �ֵ������� �ٲ��� �ʴ� ���
		// ���� ��� ��� - ���� �� ��ġ�� ��� �ִ����� ���� �ٲ�� ���
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}