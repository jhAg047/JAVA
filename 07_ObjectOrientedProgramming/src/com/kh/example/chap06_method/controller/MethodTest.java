package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTest {
	// 매개변수의 유무와 반환값 유무에 따른 구분
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		// 반환 값X       매개변수 X
		System.out.println("매개변수와 반환 값 둘다 없는 메소드입니다.");
	}
	// 2. 매개변수 없고 반환 값 있는 메소드
	public int method2() {
	//     반환 값 O      매개변수 X
	//This method must return a result of type int : 이 메소드는 반드시 int형 결과를 리턴해야함
	//반환형이 존재하는 메소드에서 return값을 명시해주지 않았을 때 나오는 애러
	//(현재 반환해야하는 값이 int이기 때문에 type int라고 뜨는것)
	//	return 0; 
		int i = 10;
		return i;
	}
	// 3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int num1,int num2) {
	//     반환 값 X            매개변수 O a - 매개변수 개수는 제한이 없다
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
		System.out.println("sum : "+ sum);
//		return; //나를 호출한 메소드로 돌아가는데 반환 값을 안가지고 돌아감 
	}
	// 4. 매개변수 있고 반환 값 있는 메소드
	public int method4(int num1,int num2) {
		// 반환 값 O            매개변수 O
		//This method must return a result of type int
		return num1 + num2; // 꼭 변수에 담지 않아도 반환 가능
	}
	// 심화 1. 반환 값이 배열인 경우 : 배열의 주소값 (얕은복사)
	public int[] method5() {
		int[] iArr = {1,2,3,4,5};
		for(int i=0;i<iArr.length;i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr :" + iArr);
		return iArr;
	}
	
	// 심화 2. 반환 값이 클래스인 경우
	public User method6() {
		User user = new User("user01","pass01","전희은");
		System.out.println("MethodTest user : "+ user);
		
		return user;
	}
	
}
