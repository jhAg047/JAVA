package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { // <== 클래스 영역의 시작
	
	//클래스 영역에 작성하는 변수 : 필드
	//필드 == 멤버변수 == 멤버필드 == 전역 변수
	
	/*접근제한자 자료형 변수명*/
	private int globalNum;
	
	
	public void method1(int num) { // <== 메소드 영역의 시작
		//             --------- 매개변수: 메소드의 선언부 중 괄호 안에 선언하는 변수
		
		//메소드 영역에서 작성하는 변수 : 지역변수
		int localNum;
		// 매개변수 역시 지역변수의 일종으로 생각함
		
		localNum =10;
		System.out.println(localNum);
		//초기화가 안되서 나오는 오류
		//The local variable localNum may not have been initialized : 지역변수는 반드시 초기화가 되어있어야 함
		
		System.out.println(num);//매개변수는 값이 이미 들어가있는 상태여서 초기화가 필요 없음
		System.out.println(globalNum); //전역변수여서 초기화 안해도 오류X
	} // <== 메소드 영역의 끝
	public void method2() {
//		System.out.println(localNum);
		// localNum cannot be resolved to a variable : method1에서 선언한 지역변수이기 때문에 오류
		// 지역변수는 해당 지역 내에서만 사용 가능
		System.out.println(globalNum);
		// 전역 변수는 클래스 영역안에서 사용 가능
	}
} // <== 클래스 영역의 끝
