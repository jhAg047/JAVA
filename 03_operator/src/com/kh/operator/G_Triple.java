package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������
	// ���� : (���ǽ�)? ��1 : ��2;
	// ���ǽ��� true�� �� ��1 ����, false�� �� ��2 ����	
	public void method() {
		//�Է��� ������ ������� �ƴ��� �Ǻ�
		//����� "�����", ����� �ƴϸ� "����� �ƴϴ�"��� ���� ���
		//"���� �ϳ� �Է� : " �̶�� �ȳ��� ��� �� �Է��� ������ num�� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϳ� �Է� : ");
		int num = sc.nextInt();
//		String result = num > 0 ? "�����" : "����� �ƴϴ�";
		
		//��ø ���� ������
		String result = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
		System.out.println(num + " ���ڴ� " + result);
		}
	public void method2() {
		//�Է��� ������ ¦������ Ȧ������ �Ǻ�
		//Ȧ���� "Ȧ���Դϴ�" , ¦���� "¦���Դϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		//1. �ѹ��� ��ġ�� 
		//String result = num%2 == 0 ? "¦�� �Դϴ�" : "Ȧ�� �Դϴ�";
		
		//2. ���ǽĸ� ���� ����
//		boolean bool = num % 2 == 0;
//		String result = bool ? "¦�� �Դϴ�" : "Ȧ�� �Դϴ�";

		//3. ���ĸ� ���� ����
		int mod = num % 2;
		String result = (mod) == 0 ? "¦�� �Դϴ�" : "Ȧ�� �Դϴ�";
		
		System.out.println(num +"��(��) "+ result );
		
		
	}
}