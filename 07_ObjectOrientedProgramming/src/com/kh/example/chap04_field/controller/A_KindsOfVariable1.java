package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { // <== Ŭ���� ������ ����
	
	//Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ�
	//�ʵ� == ������� == ����ʵ� == ���� ����
	
	/*���������� �ڷ��� ������*/
	private int globalNum;
	
	
	public void method1(int num) { // <== �޼ҵ� ������ ����
		//             --------- �Ű�����: �޼ҵ��� ����� �� ��ȣ �ȿ� �����ϴ� ����
		
		//�޼ҵ� �������� �ۼ��ϴ� ���� : ��������
		int localNum;
		// �Ű����� ���� ���������� �������� ������
		
		localNum =10;
		System.out.println(localNum);
		//�ʱ�ȭ�� �ȵǼ� ������ ����
		//The local variable localNum may not have been initialized : ���������� �ݵ�� �ʱ�ȭ�� �Ǿ��־�� ��
		
		System.out.println(num);//�Ű������� ���� �̹� ���ִ� ���¿��� �ʱ�ȭ�� �ʿ� ����
		System.out.println(globalNum); //������������ �ʱ�ȭ ���ص� ����X
	} // <== �޼ҵ� ������ ��
	public void method2() {
//		System.out.println(localNum);
		// localNum cannot be resolved to a variable : method1���� ������ ���������̱� ������ ����
		// ���������� �ش� ���� �������� ��� ����
		System.out.println(globalNum);
		// ���� ������ Ŭ���� �����ȿ��� ��� ����
	}
} // <== Ŭ���� ������ ��
