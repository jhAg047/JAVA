package com.kh.example.list.model.vo;

public class Student implements Comparable<Student>{
	// - name:String
	// - score:int
	
	// + Student()
	// + Student(name:String, score:int)
	
	// + getter/setter
	// + toString():String
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name+ "(" + score+"점)";
	}
	
	//오버라이딩(equals/hashCode) - eclipse에서 기본으로 제공하는 방법으로 할꺼임~!
	@Override
	public int hashCode() {
		//eclipse에서 기본으로 제공하는 방법
		//hashcode 오버라이딩 찾아보면 다른 방법도 있음 
		final int prime = 31; //컴퓨터가 인지했을때 계산하기 좋으면서 적당히 큰 소수 = 31
		int result =1;
		result = prime * result + ((name == null ) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//객체 자체를 비교(this,obj) 필드 비교는 안함
		if(this == obj) { //만약 나(참조형 변수:주소값가지고있는거)랑 매개변수랑 같으면 ~! 주소값
			return true;
			}
		if(obj == null) { 
			return false;
		}
		if(getClass() != obj.getClass()) { //getClass : 내 클래스에 대한 정보를 가지고 있는 메소드
			return false;
		}
		//////////////
		////필드 비교////
		Student other =(Student)obj; //형변환
		//이름
		//참조형 자료형 비교 할때
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)){
			return false;
		}
		//점수 
		//기본자료형 비교 할 때 
		if(score != other.score) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Student o) {
		// 이름에 대해서 오름차순 정렬
		// 이름 ==> String
		// ==> String에 대해서 오름차순 정렬
		
		String otherName = o.getName();
		
		/*
		 	compareTo의 반환값 : int
		 	비교 주체가 비교 대상과 같으면 0 반환
		 	비교 주체가 비교 대상보다 크면 1 반환
		 	비교 주체가 비교 대상보다 작으면 -1 반환
		 	내림차순은 결과 뒤집으면 되니까 - 만 붙이면 됨
		 */
		
		return name.compareTo(otherName); // 오름차순 
//		return -name.compareTo(otherName); // 내림차순은 마이너스만 붙이면 됨
	}
}
