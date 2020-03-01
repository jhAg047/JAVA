package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출 됨...");
		try {
			method2();
			System.out.println("예외 발생 시에 출력될까? ㄴㄴ출력안됨 method2에서 예외 발생하니까 catch로 넘어갔음"); //catch로 넘어가서 출력X
		} catch (IOException e) {
			
//			System.out.println(e.getMessage());  // 예외 발생시 던져주는 메세지만 출력하고싶을때 사용
		} catch (Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			System.out.println("예외 발상 여부와 상관 없이 무조건 수행됨");
		}
		System.out.println("method1() 종료 됨...");
	}
	public void method2() throws IOException {
		System.out.println("method2() 호출 됨...");
		method3();
		System.out.println("method2() 종료 됨...");
	}
	public void method3() throws IOException {
		System.out.println("method3() 호출 됨...");
		throw new IOException("IOException을 강제로 발생시켰습니다."); //IOException은 import해줘야함 ()안에 문자 넣으면 같이 보냄
//		System.out.println("method3() 종료 됨...");
	}
}
