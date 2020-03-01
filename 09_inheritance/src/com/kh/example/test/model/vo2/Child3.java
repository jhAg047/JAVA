package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent {
	public Child3() {
//		super.num =10; private은 해당패키지에서만 쓸수있음
//		super.dNum=90.9; 패키지가 달라서 불가능
		super.bool = false; 
		//다른 패키지 이지만 상속을 받았기 떄문에 접근 가능
		super.ch='b';
	}
}
