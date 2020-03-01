package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - = private
	//- userId : String
	//- userPwd : String
	//- userName : String
	//- enrollDate : Date(java.util)
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//생성자 사용 목적(객체가 하는 일)
	//		1. 객체를 생성해주기 위한 목적
	// 		2. 매개변수로 전달받은 값으로 필드 초기화하는 목적
	
	//생성자 사용 규칙
	//		1. 생성자명은 클래스명과 동일해야한다
	//		2. 반환형(리턴형)이 존재하지 않음 
	
	public User() {} // 기본 생성자  : 매개변수가 없는 생성자
	//JVM이 기본적으로 생성해줌
	//매개변수 있는 생성자를 만들면 JVM이 자동으로 생성해주지 않기 때문에 반드시 명시해야함
	
//	public User() {} 
	//Duplicate method User() in type User : 메소드 User()가 중복됨 왜? 오버로딩이 적용X
	//같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지않으면 에러 발생
	
	//같은 이름이라면 지역변수를 우선으로 가져감
	public User(String userId,String userPwd) { //매개변수의 개수가 달라서 오버로딩 적용
		//this. 내 안으로 들어가서 찾는거 : 전역변수
		this.userId = userId; //지역변수를 우선으로 가져가는거라서 아무 효과가 없음 
		this.userPwd = userPwd;
	}
	
	public User(String userId,String userPwd,String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd); //위에 있는User(Stirng userId,String userPwd) 호출
		this.userName = userName;
	}
	
	public User(String userId,String userPwd,String userName,Date enrollDate)
		{
		//1) 직접적 선언 
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
//		this.enrollDate = enrollDate;
		
		//2) this() 사용
		this(userId,userPwd,userName);
		this.enrollDate = enrollDate;
	}
		
	
//	public User(String id,String name) { 
//		//Duplicate method User(String, String) in type User
//		//개수 순서 타입이 같아서 오버로딩이 안됨 매개변수의 이름이 달라도 타입이랑 개수가 같아서 안됨
//		
//		userId = id;
//		userName = name;
//	}
	public void inform() {
		System.out.println(userId +", "+userPwd+", "+userName+", "+enrollDate);
	}
}
