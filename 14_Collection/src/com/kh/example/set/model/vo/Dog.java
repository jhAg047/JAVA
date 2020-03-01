package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog> {
	// - name : String
	// - weight : double
	
	// + 기본 생성자
	// + 매개변수 있는 생성자(모두)
	
	// + getter/setter()
	// + toString() : String
	//        ㄴ형식 : 이름(몸무게kg)
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name,double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+ name + "(몸무게:" + weight + "kg)";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		// 객체 자체를 비교
		if(this == obj) { 
		return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() !=obj.getClass()) {
			return false;
		}
		// 필드 비교
		Dog other = (Dog)obj;  // 형변환
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Dog o) {
		// 이름에 대해서 오름차순
		String other = o.getName();
		return name.compareTo(other);
	}
		
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
