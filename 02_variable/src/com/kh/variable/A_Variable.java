package com.kh.variable;

public class A_Variable { // Ŭ���� 
	
	public void declareVariable(){ //�޼ҵ�
		//���� ���� �� �ʱ�ȭ 
		//A. �������� : �ڷ��� ������;
		//1. ���� 
		boolean isTrue;
		//2. ������
		//2-1. ����
		char ch;
		//2-2. ���ڿ�
		String str; 
		//3. ������ 
		//3-1. ����
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//3-2. �Ǽ�
		float fNum;
		double dNum;
		
		//B. �ʱ�ȭ(����) : ������ = ��;
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		//fNum = 4.0; //f�Ⱦ��� �⺻�� double�� ���� �ʾƼ� ����~~!
		//Type mismatch: cannot convert from double to float
		// : 4.0�� �Ǽ��ε� �Ǽ��� �⺻���� double�̱� ������
		// 4.0�� float�� �ƴ� double�� ���� ���� 
		// �ٵ� fNum�� �ڷ����� float(4byte)�ε� �ְ��� �ϴ� ���� 8byte�� double���̱� ������
		// ū ���� ���� ������ ��������� ���ٸ鼭 ������ ����
		fNum = 4.0f;
		dNum = 8.0; // 8.0d�� �ص� ������

		ch = 'A'; //���ڴ� '' ���, �ѱ��ڸ� �ֱ�! �ѱ��� �ʰ��ϸ� ������
		str= "Abcdefg"; // ���ڿ��� "" ���, �ѱ��ڸ� �׳� string �ȿ� �־ �������
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNUM�� �� :" + bNum);
		System.out.println("sNUM�� �� :" + sNum);
		System.out.println("iNUM�� �� :" + iNum);
		System.out.println("lNUM�� �� :" + lNum);
		System.out.println("fNUM�� �� :" + fNum);
		System.out.println("dNUM�� �� :" + dNum);
		System.out.println("ch�� �� :" + ch);
		System.out.println("str�� �� :" + str);
		
		}
	
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		// 1. ����
		boolean isTrue = false;
		// 2. ������
		// 2-1. ����
		char ch ='��';
		//2-2. ���ڿ� 
		String str = "KH����������";
		// 3. ������
		// 3-1. ����
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum=8;
		
		// 3-2. �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0d; //8.0 ����ص� ����
		
		System.out.println("isTure�� �� : " + isTrue);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		System.out.println("bNum�� ��  : "+ bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		
	}
	
	
	
	
	
	
	
	
}
