package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
		
	// && : 피연산자가 모두 true일 떄 true 반환(그리고, ~면서)
	// || : 피연산자 중에서 하나라도 true일 때 true반환(또는, ~거나)
	
	public void method1() {
		//입력한 정수 값이 1~100사이의 숫자인지 확인
		//정수 하나 입력 : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		//1~100 사이의 숫자
		//숫자가 1보다 크거나 같!!고!! ,100보다 작거나 같다. ==> &&(AND)
		System.out.println("1부터 100사이의 숫자인지 확인 : " + (num >=1 && num <=100));
		
	}
	public void method2() {
		//입력한 문자값이 대문자인지 확인
		//문자하나 입력 : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isCap = (ch >= 'A' && ch <= 'Z'); //문자 숫자 치환되기때문에 크다 작다로 표현할수있음
		System.out.println("영어 대문자가 맞습니까? " + isCap);
		
		//계속 하시려면 y 혹은 Y를 입력하세요:
		//계속하겠다고 하셨습니까? : ______(결과값)
		
		System.out.print("계속하시려면 y 혹은 Y를 입력하세요 : ");
		char yy = sc.nextLine().charAt(0);
		boolean yn = (yy == 'y' || yy == 'Y');
//		System.out.println("계속하겠다고 하셨습니까? : " + yn);  //반복문~!
		System.out.println("계속하겠다고 하셨습니까? : " + (yy == 'y' || yy == 'Y'));
		
	}
}
