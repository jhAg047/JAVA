package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : "); //안내 문구 역할 
		String name = sc.nextLine(); //next();만 써도 괜찮음 입력받을때까지 종료 X
		
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.print("키(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " +  age + "세이며, 키는" + height + "cm 입니다.");
		
		
	}
	public void inputScanner2() {
		//scanner 쓸때 유의해야할점
		//사용자에게 이름과 나이를 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : "); //buffer : 이름\n
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : "); //buffer : 나이\n 
//		int age = sc.nextInt(); // 줄바꿈을 남겨서 지금 버퍼안에 \n 있음
//		System.out.print("주소를 입력하세요 : "); // \n을 값으로 인식해버리고 가져가버림
//		String address = sc.nextLine(); 
		//해결하는 방법 
		//방법1. 줄바꿈을 가져갈 수 있는 nextLine() 추가
//		int age = sc.nextInt();
//		sc.nextLine(); // 버퍼에 남아있는 줄바꿈을 가져와주는 역할!
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
//		
//		
		
		//방법2. age를 받을때도 nextLine()을 쓰되 int로 파싱하기
		//파싱 : 문자열을 기본자료형으로 바꿔주는 일
		//"1" (string -> int O) ,"박신우" (X) 
		//"true" "박신우"
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge); // 입력받은 String을 int로 파싱하는법
		//한줄로 바꾸기
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		//이럴때는 배열을 사용
		//방법3. next()로 주소받기, 버퍼에 줄바꿈을 남김 
		//한계 : next메소드는 띄어쓰기를 구분자로 인식하기 때문에 띄어쓰기가 들어간 주소같은경우 처음만 가져옴 서울시 강동구 -> 서울시 만 가져옴
//		int age = sc.nextInt(); 문자입력하면 에러남
//		String address = sc.next(); // next메소드는 띄어쓰기를 구분자로 인식해버림
		
		//+ 추가  : char형을 받고 싶을 때는?
		System.out.print("성별을 입력하세요 : "); // F/M
//		String usergender = sc.nextLine();
//		char gender = usergender.charAt(0);
		//한줄로 바꾸기
		char gender = sc.nextLine().charAt(0); //gender의 0번째 문자를 가져온다
		//char(int index) : 문자열의 index번째의 문자를 가져와주는 메소드
		
		System.out.println(name + "님은 " + age + "세이며, 주소는 " + address + " 입니다.");
		System.out.println("gender : "+ gender);
	}
}
