package com.kh.variable;

public class A_Variable { // 클래스 
	
	public void declareVariable(){ //메소드
		//변수 선언 후 초기화 
		//A. 변수선언 : 자료형 변수명;
		//1. 논리형 
		boolean isTrue;
		//2. 문자형
		//2-1. 문자
		char ch;
		//2-2. 문자열
		String str; 
		//3. 숫자형 
		//3-1. 정수
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//3-2. 실수
		float fNum;
		double dNum;
		
		//B. 초기화(대입) : 변수명 = 값;
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		//fNum = 4.0; //f안쓰면 기본형 double과 맞지 않아서 오류~~!
		//Type mismatch: cannot convert from double to float
		// : 4.0은 실수인데 실수의 기본형은 double이기 때문에
		// 4.0을 float가 아닌 double로 보고 있음 
		// 근데 fNum은 자료형은 float(4byte)인데 넣고자 하는 값은 8byte인 double형이기 때문에
		// 큰 값을 작은 공간에 집어넣을수 없다면서 에러가 떴음
		fNum = 4.0f;
		dNum = 8.0; // 8.0d로 해도 무방함

		ch = 'A'; //문자는 '' 사용, 한글자만 넣기! 한글자 초과하면 에러남
		str= "Abcdefg"; // 문자열은 "" 사용, 한글자를 그냥 string 안에 넣어도 상관없음
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNUM의 값 :" + bNum);
		System.out.println("sNUM의 값 :" + sNum);
		System.out.println("iNUM의 값 :" + iNum);
		System.out.println("lNUM의 값 :" + lNum);
		System.out.println("fNUM의 값 :" + fNum);
		System.out.println("dNUM의 값 :" + dNum);
		System.out.println("ch의 값 :" + ch);
		System.out.println("str의 값 :" + str);
		
		}
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = false;
		// 2. 문자형
		// 2-1. 문자
		char ch ='가';
		//2-2. 문자열 
		String str = "KH정보교육원";
		// 3. 숫자형
		// 3-1. 정수
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum=8;
		
		// 3-2. 실수
		float fNum = 4.0f;
		double dNum = 8.0d; //8.0 사용해도 무관
		
		System.out.println("isTure의 값 : " + isTrue);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		System.out.println("bNum의 값  : "+ bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		
	}
	
	
	
	
	
	
	
	
}
