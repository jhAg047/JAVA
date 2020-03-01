package com.kh.example.animal.model.vo;

public class Animal {
	// - name : String 
	// - age : int
	// - weight : double 
	private String name;
	private int age;
	private double weight;
	
	// + Animal()
	// + Animal(name:String, age: int,double:weight)
	
	public Animal() {}
	public Animal(String name,int age,double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	// + getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	// + inform() : String
	//	반환 형식 : 이름 나이 몸무게
//	public String inform() {
//		return name+" " + age+" "+weight;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//대표값 재정의
		return name+" " + age+" "+weight; //super = object
	}
}
