package com.kh.example.chap06_method.model.vo;

public class Trainee {
	//필드 선언
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score; 
	
	//기본생성자 생성
	public Trainee() {} //String ACADEMY는 상수라서 받아오는거 의미 없음
	public Trainee(String name) {
		this.name = name;
	}
	public Trainee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
		Trainee.score = score; //클래스명.
		//score는 static영역에 올라가서 굳이 객체 생성X this. X
	}
	//필드에 있는 name을 받아온 매개변수를 통해 초기화 시키는 setter
	//setter 형식
	public void setName(String name) {
		this.name = name;
	}
	//필드에 있는 classRoom을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	//필드에 있는 score을 받아온 매개변수를 통해 초기화 시키는 setter
	public static void setScore(double score) {
		Trainee.score = score;
	}
	
	//필드에 있는 name을 반환하는 getter
	public String getName() {
		return name; //지역변수가 없어서 전역변수 name
	}
	//필드에 있는 ACADEMY을 반환하는 getter
	public String getACADEMY() {
		return ACADEMY;
	}
	//필드에 있는 classRoom을 반환하는 getter
	public char getClassRoom() {
		return classRoom;
	}
	//필드에 있는 score을 반환하는 getter
	public static double getScore() {
		return score;
	}
	public String inform() {
		return name +", " + ACADEMY +", " + classRoom + ", "+ score;
	}
}
