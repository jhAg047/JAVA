package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// ��ü ���� : B_KindsOfVariable2
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
		//B_KindsOfVariable2() : ������
		int a = bkv.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		//static ����� ����ؼ� ��ü ���� ���ϰ� �Ҽ�����!!
		//��ü �����ص� ����� ����
		//����� - ����� �ǹ�
		//static ���� : Ŭ�����̸�.������;
		int a1 = B_KindsOfVariable2.staticNum; 
		//static������ �ö��ֱ� ������ ��ü ���� ���� ����
		
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		
		
		Product p = new Product();
		p.inform();
		// JVM �⺻�� : null, null, 0, 0
		// ����� �ʱ�ȭ : ��������, ������, 1500, 100
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 80
		// num�� static������ �־ ���� �ν��Ͻ� �ʱ�ȭ ������ ���ؼ� 90���� ���̰� 
		// �׻��·� 10�� ���̴ϱ� 80
		
		Product p3 = new Product();
		p3.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000,70
		// ĭ��, �Ե�, 1000, 139
		// ĭ��, �Ե�, 1000, 129
		// ĭ��, �Ե�, 1000, 119
		
		
		
		//static���� �Ǿ��ִ°�
//		System.out.println();
//		Arrays.copyOf(null,0);
//		Integer.parseInt(null);
//		Math.random();
//		"".length();
		
		
	}
}
