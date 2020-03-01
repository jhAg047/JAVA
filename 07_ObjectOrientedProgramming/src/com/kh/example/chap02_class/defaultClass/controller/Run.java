package com.kh.example.chap02_class.defaultClass.controller;

public class Run {
	public static void main(String[] args) {
		//같은 패키지 내에 있기때문에 오류X
		DefaultClassTest dct = new DefaultClassTest();
		dct.test();
	}
}
