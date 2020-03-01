package com.kh.example.chap01_encapsulation;

public class Account {
	//접근 제한자는 자료형 앞에 쓴다
	//멤버 변수 : 클래스 영역에 있는 변수
	//멤버 변수 = 멤버 필드 = 필드 = 전역 변수
	//자바에서 멤버 변수 사용할때는 private 써야함 (예외도 있기는함)
	private String name = "전희은";
	private String phone = "010-9078-3699";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //잔액	
	
	//입금 메소드 
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name+ "님의 계좌에" + money +"원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	//출금 메소드 
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name+"님의 계좌에서 "+money +"원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	public void displayBalance() {
		System.out.println(name +"님의 계좌에 잔액은 "+balance+"원입니다.");
	}
}
