package com.kh.variable;

//�����÷ο�
public class C_Overflow { //Ŭ���� 
	public void overflow() { //�޼ҵ�
		byte bNum = 127;
		bNum = (byte)(bNum + 1); //�����÷ο�
		System.out.println("bNum : "+ bNum);
	}
	
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
		//int result = num1 * num2;
		long result = (long)num1 * num2; // long * int = long
		System.out.println("����� : "+ result);
		
	}
}
