package com.kh.example.chap02_class.defaultClass.controller;

//default는 명시하는게 아니라 그냥 생략하는거 
//접근제한자를 작성하지않으면 default의 의미를 가짐(default 명시하면 에러 발생)
/*default*/class DefaultClassTest {
	public void test() {
		System.out.println("default클래스 내의 test() 호출됨...");
	}
}
