package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/* 
	 	while(조건식) {
	 		실행 문장
	 		[증감식 or 분기문;] //[] 생략 가능!
	 	}
	 	조건식 확인 -> (조건식 true일 때) 실행 문장 수행 -> 조건식 확인 -> (반복)
	 	조건식 결과가 false가 될 때까지 반복
	 	
	 */
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "번째 반복문 수행");
			i++; //꼭 아래에 넣을필요는 없는데 증감식 먼저쓰면 증감식이 먼저 수행됨
		}
	}
	public void method1_1() {
		//자기 소개 다섯 번 하기 : 내 이름은 전희은이야
		int i = 0;
		while (i<5) {
			System.out.println("내 이름은 전희은이야");
			i++;
		}
	}
	public void method2() {
		// 5부터 1까지 출력
		int i = 5;
		while (i>=1) {
			System.out.println(i);
			i--;
		}
	}
	public void method3() {
		//1에서 10사이의 홀수만 출력
		int i = 1;
		while (i<= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	public void method4() {
		// 정수 두 개를 입력 받아 그 사이 숫자 출력
		// 정수 두 개를 입력하세요.
		// 단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
		// 첫 번째 숫자:
		// 두 번째 숫자:
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫번째 숫자가 두 번째 숫자보다 작게 입력해주세요");
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자  : ");
		int end = sc.nextInt();
		int min,max = 0;
		if (start > end) {
			min = end;
			max = start;
		} else {
			min = start;
			max = end;
		}
		while (min <= max) {
			System.out.print(min+ " ");
			min++;
		}
		
	}
	public void method4_1() {
		// 정수를 하나 입력 받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력
		// 조건식 맞지 않으면 1~9 사이의 양수를 입력하여야합니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 정수 하나를 입력하세요 : ");
		int i = sc.nextInt();
		int a = 1;
		if (i >= 1 && i <= 9) {
			while (a <= 9) {
				System.out.printf("%d * %d = %d%n",i,a,(i*a));
				a++; // 증감식 까먹지 않기~~!
			}
		} else {
			System.out.println("1에서 9사이의 양수를 입력하여야 합니다");
		}	
		}
	public void method5() {
		//1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
		 int random = (int)(Math.random()* 10+1);
		 int sum = 0;
		 int i = 1;
		 while(i <= random) {
			 sum += i;
			 i++;
		 }
		 System.out.printf("1부터 %d까지의 정수 합계 : %d",random,sum);
	}
	public void method6() {
		// 사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple	문자열 입력 : love
		// 0 : a			0 : l
		// 1 : p			1 : o
		// 2 : p			2 : v
		// 3 : l			3 : e
		// 4 : e
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); //apple	
		//문자열의 길이를 반환하는 메소드 :length() 
		int length = str.length();
		System.out.println(str + "의 길이 : " + length);
		//for
//		for (int i = 0;i < length; i++) {
//		for (int i = 0;i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i+" : " + ch);
//		}
		//while
		int i = 0;
		while (i < length) {
			char ch = str.charAt(i);
			System.out.println(i+" : " + ch);
			i++;
		}
	}
	public void method7() {
		//2단부터 9단까지 출력
		int a = 2;
		while (a <= 9) {
			int b = 1; 
			while (b <= 9) {
				System.out.printf("%d * %d = %d%n",a,b,(a*b));
				b++;
			}	
			a++;
			System.out.println();
		}
	}
	public void method8() {
		//아날로그 시계
		int h = 0;
		while (h <= 24) {
			int m = 0;
			while(m < 60) {
				System.out.printf("%02d시 %02d분%n",h,m);
				//%2d : 2자리 확보하고 정수 넣기  (빈칸에 대해서 오른쪽 정렬)
				//%-2d : 2자리 확보하고 정수 넣기 (빈칸에 대해서 왼쪽 정렬)
				m++;
			} 
			h++;
		}
	}
	public void method9() {
		Scanner sc = new Scanner(System.in);
		//많이 씀
		int menuNum = 0 ; 
		while(menuNum != 9) { //menuNum이 9가 아닐때 실행 ~!
		System.out.println("1. 1~5까지 출력");
		System.out.println("2. 5~1까지 출력");
		System.out.println("3. 1부터 10사이 홀수 출력");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택 : ");
		menuNum = sc.nextInt(); //새로운 공간을 만드는게 아닌 공간을 활용하는것
		switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못입력하셨습니다.");
		}
		}
	}
}