package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {

	/* 
	 �ܵ� if��
	 if(���ǽ�){
	 	������ ����;
	 	}
	 	
		���ǽ��� ��� ���� ��(true)�̸� {} �ȿ� �ִ� �ڵ� ����
		���ǽ��� ��� ���� ����(false)�̸� {} �ȿ� �ִ� �ڵ�� �����ϰ� �Ѿ
	 */
	public void method1() {
		//Ű����� �Է��� ���ڰ� ������� �������� ����Ͻÿ�
		//'���ڸ� �� �� �Է��ϼ��� : ' �ȳ���Ʈ ��� �� num������ �Է��� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		}
		
		if (num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		if (num < 0 ) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
		System.out.println("���α׷� ����");
		
	}
	public void method2() {
		//Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		
		//'���� �� ���� �Է��ϼ��� : ' �ȳ����� ��� �� num������ ������ ����
		//¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸�  "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}
		if (num % 2 != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}
	
}
