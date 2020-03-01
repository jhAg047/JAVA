package com.kh.example.chap02_class.publicClass.run;

//PublicClassTest의 위치를 찾으려고 import 사용 
import com.kh.example.chap02_class.publicClass.controller.PublicClassTest;



public class Run {
	public static void main(String[] args) {
//		PublicClassTest pct = new PublicClassTest();
		//import 안하는 방법 : 경로명 다쓰기
		//이름이 같은데 패키지가 다를때 사용 ex) Date패키지 
		com.kh.example.chap02_class.publicClass.controller.PublicClassTest pct = new com.kh.example.chap02_class.publicClass.controller.PublicClassTest();
		pct.test();
	}
}
