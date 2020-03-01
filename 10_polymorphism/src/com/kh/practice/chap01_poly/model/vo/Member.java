package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	public Member() {}
	public Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return name + age + gender;
	}
}
