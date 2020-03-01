package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 	for(초기식; 조건식; 증감식){
	 		실행 문장;
	 	}
	 	초기식 -> 조건식 -> (조건문이 true일때)실행 문장 -> 증감식 -> 조건식 -> (반복)
	 	조건식 결과가 false가 될 때까지 반복
	 	증감식 : 반복문을 끝내기위한 하나의 장치
	 	증감식이 없으면 반복문이 안끝남 
	 	
	 	for문 안에 있는 초기식, 조건식, 증감식 모두 생략 가능
	 	하지만, 모두 생략했을 때 반복문이 무한으로 돌기때문에
	 	for문 안이나 밖에다가 초기식은 무엇인기 조건은 무엇인지 증감은 얼마나 될건지를 모두 표기해야함
	 	즉 for() 안에서만 생략될 뿐 모두 필요한 요소임
	 	
	 */
	public void method1() {
		// 1부터 5까지 출력
		for (int num = 1; num <= 5; num++) {
			System.out.println(num + "번째 반복문 수행");
		}
	}
	public void method1_1() {
		//자기 소개 다섯번 하기  : 내이름은 전희은이야
		for (int num = 0; num < 5; num++) {
			System.out.println("내이름은 전희은이야");
		}

	}
	public void method2() {
		//5부터 1까지 출력하기
//		for(int num=5; num > 0 ; num--) {
//			System.out.println(num);
//		}
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(6-i);
//		}
	}
	public void method2_1() {
		//8에서 3까지 출력
		for(int i = 8; i >= 3;i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		for (int i=1; i <= 10;i+=2) {
			System.out.print(i+" ");
		}
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
		}
	}
	public void method4() {
		//정수 2개를 입력받아서 그 사이 숫자를 출력하세요
		/* 
		 정수 두 개를 입력하세요.
		 단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
		 첫 번째 숫자: 1
		 두 번째 숫자: 5
		 1 2 3 4 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		int max,min = 0;
		if (start > end) {
			max = start;
			min = end;
		}
		else {
			max = end;
			min = start;
		}
		
//		for (int i = min; i <= max; i++) {
//			System.out.print(i + " ");
//		}
		//초기식 생략
		for ( ; min <= max; min++) {
			System.out.print(min + "");
		}
		
	}
	public void method4_1() {
		//정수 하나를 입력받아 그 수가 1~9사이의 수일때만 그 수의 구구단 출력
		//조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력  : ");
		int num1 = sc.nextInt();
		if (num1 >= 1 && num1 <= 9) {
			for (int num2 = 1; num2 <= 9;num2++) {
				System.out.println(num1 + "*" + num2 + "=" + num1*num2 );
			}
				
		} else {
			System.out.println("1~9사이의 양수를 입력하여야합니다.");
		}
	}
	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		// Math.random(); // 임의의 난수(실수)를 반환하는 메소드
		// 원래  Math.random()의 범위 : 0 <= Math.random() < 1
		// 10까지 만들기 위해 10곱하기 : 0 <= Math.random*10 < 10
		// 10을 포함하기 위해 1더하기 : 1 <= Math.random*10+1 <= 11
		// 정수로 만들기 위해 int형변환 : 1 <= (int)(Math.random()*10+1) <11
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		System.out.println(random);
		for (int i=1; i <= random; i++) {
			sum +=i;
		}
		System.out.printf("1부터 %d까지 정수 합계 : %d", random, sum);
	}
	
	public void method6() {
		//2단부터 9단까지 출력 
		for (int dan = 2; dan <= 9 ; dan++) {
			for(int su =1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan,su,(dan*su)); //printf 줄바꿈 %n,\n
			}
			System.out.println();
		}
	}
	public void method7() {
		//아날로그 시계 출력 : 0시 0분 ~ 23시59분
		for(int h = 0; h < 24; h++) {
			for(int min=0 ; min < 60; min++) {
				System.out.printf("%d시 %d분%n", h,min);
			}
			System.out.println();
		}
	}
	public void method8() {
		//한줄에 별(*)표가 5번 출력되는데
		// 그 줄은 사용자가 입력한 수만큼 출력
		/* 
		  	출력할 줄 수 : 3
		  	*****
		  	*****
		  	*****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int l = sc.nextInt();
		for (int a = 1; a <= l; a++) {
		for(int i = 0; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public void method9() {
		//한 줄에 별표 문자를 입력된 줄 수와 칸수 만큼 입력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
			/* 
			 	줄 수 : 6
			 	칸 수 : 6
			 	1*****
			 	*2****
			 	**3***
			 	***4**
			 	****5*
			 	*****6
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int l = sc.nextInt();
		System.out.print("칸 수 : ");
		int k = sc.nextInt();
		for(int a = 1; a<=l; a++) {
		for (int b = 1; b<=k; b++) {
			if (a==b)
			{
				System.out.print(a);
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
		}	
	}
	
}
