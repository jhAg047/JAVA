package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account(); //heap영역에 객체 생성 : 인스턴스화
		
		//현재 잔액 조회 
		a.displayBalance();
		
		//입금
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		//출금
		a.withdraw(500000);// 메소드를 통한 접근
		a.displayBalance();
		
//		a.balance -= 2000000; //변수에 private를 안걸어놔서 접근 가능
		//private 걸어놔서 에러뜸
		//The field Account.balance is not visible : 필드에 balance가 안보인다!
		//private은 나 자신,내부클래스(Account)에서만 볼 수 있게끔 제한해주기 때문에
		//외부 클래스인 Run에서는 볼 수 없음
		
		a.withdraw(500000);
		a.displayBalance();
	}
}
