package com.kh.example.chap02_abstractNInterface.family.controller;

import com.kh.example.chap02_abstractNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Basic;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNInterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
	//	Family f = new Family();
	//Cannot instantiate the type Family : 추상 클래스는 객체 생성불가
	// 객체 생성을 할 수가 없다 왜? Family가 추상클래스라서
	Family f1 = new Mother("어머니",50,70,"출산");
	//왜 에러가 안날까? - 다형성,추상클래스는 참조변수로 사용가능하기 때문에
	Family f2 = new Baby("베이비",3.5,70);
	
	System.out.println(f1);
	System.out.println(f2);
	
//	Basic b = new Basic(); // 인터페이스는 추상메소드밖에 없어서 객체 생성 불가
	Basic b1 = new Mother("어머니", 50, 70,"출산");
	Basic b2 = new Baby("베이비",3.5,70);
	
	System.out.println(b1);
	System.out.println(b2);
	}
}
