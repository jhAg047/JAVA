package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자
	// 형식 : (조건식)? 식1 : 식2;
	// 조건식이 true일 때 식1 수행, false일 때 식2 수행	
	public void method() {
		//입력한 정수가 양수인지 아닌지 판별
		//양수면 "양수다", 양수가 아니면 "양수가 아니다"라는 문장 출력
		//"정수 하나 입력 : " 이라는 안내문 출력 후 입력한 정수를 num에 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수하나 입력 : ");
		int num = sc.nextInt();
//		String result = num > 0 ? "양수다" : "양수가 아니다";
		
		//중첩 삼항 연산자
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(num + " 숫자는 " + result);
		}
	public void method2() {
		//입력한 정수가 짝수인지 홀수인지 판별
		//홀수면 "홀수입니다" , 짝수면 "짝수입니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		//1. 한번에 합치기 
		//String result = num%2 == 0 ? "짝수 입니다" : "홀수 입니다";
		
		//2. 조건식만 따로 빼기
//		boolean bool = num % 2 == 0;
//		String result = bool ? "짝수 입니다" : "홀수 입니다";

		//3. 계산식만 따로 빼기
		int mod = num % 2;
		String result = (mod) == 0 ? "짝수 입니다" : "홀수 입니다";
		
		System.out.println(num +"은(는) "+ result );
		
		
	}
}
