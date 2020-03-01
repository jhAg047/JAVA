package com.kh.example.test.model.vo;

//상속 표현식
public class Child2 extends Parent{ //Child2는 Parent를 상속 받겠다 Ctrl+space로 상속받은거 확인가능 
	//확장
	private String str;
	public Child2() {
		//객체 생성을 굳이 할 필요가 없음
//		super.num= 10; 
		//num의 접근제한자 private 
		//(접근 범위가 Parent만이기 때문에 불가능)
		super.dNum = 10.2; 
		//접근 범위가 같은 패키지이기 때문에 가능
		super.bool = false;
		//접근 범위가 같은 패키지이고 후손이기 때문에 가능
		super.ch = 'a';
		//접근 범위가 전체 다이기 때문에 가능
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
