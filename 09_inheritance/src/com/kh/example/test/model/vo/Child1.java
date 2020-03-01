package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { // 같은 패키지, Parent의 자식이 아님
		Parent p = new Parent();
		
//		p.num=10; //num의 접근제한자 private이여서 불가
		p.dNum = 0.0; //같은 패키지안에 있어서 가능 (default)
		p.bool = false;
		p.ch ='A';
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
