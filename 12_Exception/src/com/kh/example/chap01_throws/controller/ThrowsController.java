package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1() ȣ�� ��...");
		method2();
		System.out.println("method1() ���� ��...");
	}
	
	public void method2() throws Exception {
		System.out.println("method2() ȣ�� ��...");
		method3();
		System.out.println("method2() ���� ��...");
	}
	
	public void method3() throws Exception {
		System.out.println("method3() ȣ�� ��...");
		throw new Exception(); // throw : ���������� Exception�߻�
		//Unhandled exception type Exception : Exception�̶�� Ÿ���� ���ܰ� ó�� ���� �ʾҴ�
//		System.out.println("method3() ���� ��..."); //����(������ ����)�� ���� ���� �� �� ���� - ������ ����
		// ������ �߻��ϸ� ������ ����Ǳ� ������ ���� �߻� �Ʒ��� ������� ������� ����
		// ���� ������ �� ���� �ڵ�, �ǹ� ���� �ڵ��� ���� �� �ߴ� ��
	}
}
