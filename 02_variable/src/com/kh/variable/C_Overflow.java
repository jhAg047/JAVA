package com.kh.variable;

//오버플로우
public class C_Overflow { //클래스 
	public void overflow() { //메소드
		byte bNum = 127;
		bNum = (byte)(bNum + 1); //오버플로우
		System.out.println("bNum : "+ bNum);
	}
	
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
		//int result = num1 * num2;
		long result = (long)num1 * num2; // long * int = long
		System.out.println("계산결과 : "+ result);
		
	}
}
