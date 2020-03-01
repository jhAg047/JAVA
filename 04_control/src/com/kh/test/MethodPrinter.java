package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA() 호출됨");
//		return; //나를 호출한 메소드에게 돌아가는 기능 main으로 돌아감
		methodB(); // Unreachable code : return쓰면 여기에 도달할수가 없어서 어차피 필요가 없어서 에러가 뜸
		//있어도 실행 안되니까 return 밑에는 코드 잘 안넣음
		System.out.println("methodA() 끝남");
	}
	public void methodB() {
		System.out.println("methodB() 호출됨");
		methodC();
		System.out.println("methodB() 끝남");
	}
	public void methodC() {
		System.out.println("methodC() 호출됨");
		System.out.println("methodC() 끝남");
	}
}
