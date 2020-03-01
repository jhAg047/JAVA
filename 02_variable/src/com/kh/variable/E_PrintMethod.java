package com.kh.variable;

public class E_PrintMethod {
	//중복되는 문구는 클래스에 선언 하기~~~!!!!!!!!!
	//전역변수 : 모든 영역에 대해 들어갈수있는변수
	String str1 = "안녕하세요";
	String str2 = "반갑습니다.";
	
		public void printExample() {
			//지역변수 : 메소드 지역 안에서만 사용할수있는 변수 
//			String str1 = "안녕하세요";
//			String str2 = "반갑습니다";
			
			System.out.print(str1);
			System.out.print(str2);
		}
		public void printlnExample() {
//			String str1 = "안녕하세요";
//			String str2 = "반갑습니다";

			System.out.println(str1);
			System.out.println(str2);
			System.out.println("전희은");
		}
		public void printfExample() {
			//안녕하세요, 전희은입니다. 반갑습니다.
			//안녕하세요 = str1 , 반갑습니다. = str2
			System.out.printf("%s, 전희은입니다. %s", str1, str2);
			//System.out.printf("내가 출력하고자 하는 형식", 출력하고자 하는 변수(순서대로))
			
			//반갑습니다, 친하게 지내요. (str1,str2만 사용해서)
			System.out.printf("%s, 친하게 지내요.",str2);
			System.out.println(); // 줄바꿈을 하겠다
			
			//미니문제
			//안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
			int age =20;
			String name = "박신우";
			String job ="강사";
			System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s",str1,age,name,job,str2);
		}
}
