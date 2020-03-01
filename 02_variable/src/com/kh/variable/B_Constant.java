package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // 일반 변수 선언
		//int AGE; 이렇게만 쓰면 상수인지 몰라서 앞에 final 써야함
		final int AGE; // 상수 선언
		
		age=20;
		AGE=20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// 변수의 값 변경
		age = 30;
//		AGE = 30;  고칠수있는 방법 없음 그냥 주석처리 하기
		//The final local variable AGE may already have been assigned
		//final변수 즉 상수는 한번만 값을 저장할수있는데 이미 20이 할당되어있어서 또 할당하려니  에러가 난다~!
		//: AGE는 final이 붙은 상수인데, 상수는 한 번만 값을 저장할수있고 값 수정은 불가능함
		// 그런데 16번째 줄에서 AGE에 30이라는 값으로 수정을 하려고하니 값에 대해서 수정이 불가능하다면서 에러남
		
		System.out.println("값 변경 후 age : " + age);
		System.out.println("값 변경후 AGE : " + AGE);
	}
}
