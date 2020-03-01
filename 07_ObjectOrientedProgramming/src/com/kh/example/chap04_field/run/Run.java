package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// 객체 생성 : B_KindsOfVariable2
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
		//B_KindsOfVariable2() : 생성자
		int a = bkv.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		//static 예약어 사용해서 객체 생성 안하고 할수있음!!
		//객체 생성해도 상관은 없음
		//노란줄 - 경고의 의미
		//static 접근 : 클래스이름.변수명;
		int a1 = B_KindsOfVariable2.staticNum; 
		//static영역에 올라가있기 때문에 객체 생성 없이 가능
		
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		
		
		Product p = new Product();
		p.inform();
		// JVM 기본값 : null, null, 0, 0
		// 명시적 초기화 : 초코파이, 오리온, 1500, 100
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80
		// num이 static영역에 있어서 위에 인스턴스 초기화 블럭으로 인해서 90으로 깎이고 
		// 그상태로 10이 깎이니까 80
		
		Product p3 = new Product();
		p3.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000,70
		// 칸초, 롯데, 1000, 139
		// 칸초, 롯데, 1000, 129
		// 칸초, 롯데, 1000, 119
		
		
		
		//static으로 되어있는거
//		System.out.println();
//		Arrays.copyOf(null,0);
//		Integer.parseInt(null);
//		Math.random();
//		"".length();
		
		
	}
}
