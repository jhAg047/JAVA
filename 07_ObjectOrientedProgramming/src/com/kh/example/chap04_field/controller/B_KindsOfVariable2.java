package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	public static int staticNum;
	
	private int testNum =10; //��ü�� ���������� �޸� ������ �ö󰡴°� : �ν��Ͻ� ���� 
	private static int staticTestNum =10; //��ü�������� �޸� ������ �ö󰡴°� : Ŭ�������� static����
	public B_KindsOfVariable2() {//������
		testNum++;
		System.out.println("testNum : " + testNum);
		
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
	
}
