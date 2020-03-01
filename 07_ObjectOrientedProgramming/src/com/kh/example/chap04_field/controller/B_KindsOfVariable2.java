package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	public static int staticNum;
	
	private int testNum =10; //객체를 만들어야지만 메모리 영역에 올라가는거 : 인스턴스 변수 
	private static int staticTestNum =10; //객체생성없이 메모리 영역에 올라가는거 : 클래스변수 static변수
	public B_KindsOfVariable2() {//생성자
		testNum++;
		System.out.println("testNum : " + testNum);
		
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
	
}
