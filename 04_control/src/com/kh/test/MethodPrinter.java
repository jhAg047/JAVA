package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA() ȣ���");
//		return; //���� ȣ���� �޼ҵ忡�� ���ư��� ��� main���� ���ư�
		methodB(); // Unreachable code : return���� ���⿡ �����Ҽ��� ��� ������ �ʿ䰡 ��� ������ ��
		//�־ ���� �ȵǴϱ� return �ؿ��� �ڵ� �� �ȳ���
		System.out.println("methodA() ����");
	}
	public void methodB() {
		System.out.println("methodB() ȣ���");
		methodC();
		System.out.println("methodB() ����");
	}
	public void methodC() {
		System.out.println("methodC() ȣ���");
		System.out.println("methodC() ����");
	}
}
