package com.kh.example.animal.model.vo;

public class Snake extends Animal {
	// - name : String 
	// - age : int
	// - weight : double
	// - pattern : String 

	private String pattern;
	
	// + Snake()
	// + Snake(name:String,age:int,weight:double, pattern:String)
	public Snake() {}
	public Snake(String name,int age,double weight,String pattern) {
		super(name,age,weight);
		this.pattern = pattern;
	}
	// + getter/setter
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	// + inform():String
	// 반환 형식 : 이름 나이 몸무게 무늬 
//	public String inform() {
//		return super.inform()+" "+ pattern;
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+pattern;
	}
}	
