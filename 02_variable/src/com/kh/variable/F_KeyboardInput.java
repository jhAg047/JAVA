package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : "); //�ȳ� ���� ���� 
		String name = sc.nextLine(); //next();�� �ᵵ ������ �Է¹��������� ���� X
		
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();

		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " +  age + "���̸�, Ű��" + height + "cm �Դϴ�.");
		
		
	}
	public void inputScanner2() {
		//scanner ���� �����ؾ�����
		//����ڿ��� �̸��� ���̸� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : "); //buffer : �̸�\n
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : "); //buffer : ����\n 
//		int age = sc.nextInt(); // �ٹٲ��� ���ܼ� ���� ���۾ȿ� \n ����
//		System.out.print("�ּҸ� �Է��ϼ��� : "); // \n�� ������ �ν��ع����� ����������
//		String address = sc.nextLine(); 
		//�ذ��ϴ� ��� 
		//���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
//		int age = sc.nextInt();
//		sc.nextLine(); // ���ۿ� �����ִ� �ٹٲ��� �������ִ� ����!
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
//		
//		
		
		//���2. age�� �������� nextLine()�� ���� int�� �Ľ��ϱ�
		//�Ľ� : ���ڿ��� �⺻�ڷ������� �ٲ��ִ� ��
		//"1" (string -> int O) ,"�ڽſ�" (X) 
		//"true" "�ڽſ�"
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge); // �Է¹��� String�� int�� �Ľ��ϴ¹�
		//���ٷ� �ٲٱ�
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		
		//�̷����� �迭�� ���
		//���3. next()�� �ּҹޱ�, ���ۿ� �ٹٲ��� ���� 
		//�Ѱ� : next�޼ҵ�� ���⸦ �����ڷ� �ν��ϱ� ������ ���Ⱑ �� �ּҰ������ ó���� ������ ����� ������ -> ����� �� ������
//		int age = sc.nextInt(); �����Է��ϸ� ������
//		String address = sc.next(); // next�޼ҵ�� ���⸦ �����ڷ� �ν��ع���
		
		//+ �߰�  : char���� �ް� ���� ����?
		System.out.print("������ �Է��ϼ��� : "); // F/M
//		String usergender = sc.nextLine();
//		char gender = usergender.charAt(0);
		//���ٷ� �ٲٱ�
		char gender = sc.nextLine().charAt(0); //gender�� 0��° ���ڸ� �����´�
		//char(int index) : ���ڿ��� index��°�� ���ڸ� �������ִ� �޼ҵ�
		
		System.out.println(name + "���� " + age + "���̸�, �ּҴ� " + address + " �Դϴ�.");
		System.out.println("gender : "+ gender);
	}
}
