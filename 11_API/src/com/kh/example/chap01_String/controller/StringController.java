package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		//String
		String str1 ="java";
		String str2 ="java";
		String str3 = new String("java");
//		str1.equals(str2);
		System.out.println("str1과 str2의 주소는 같은가? : "+(str1==str2));
		System.out.println("str1과 str3의 주소는 같은가? : "+(str1==str3));
		
		//hashCode : 주소값 반환?
		System.out.println("str1의 hashCode : "+str1.hashCode());
		System.out.println("str2의 hashCode : "+str2.hashCode());
		System.out.println("str3의 hashCode : "+str3.hashCode());
		
		
		System.out.println("str1의 실주소값 : "+System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : "+System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : "+System.identityHashCode(str3));
		
		str2 += "oracle";
		System.out.println("str1과 str2의 주소는 같은가? : "+(str1==str2));
		System.out.println("str1의 실주소값 : "+System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : "+System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : "+System.identityHashCode(str3));
	}
	
	public void method2() {
		//StringBuffer Test
		// 계속해서 값을 변경해야할 때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		// 가비지 컬렉터가 계속 지워야하는 단점이 있음 (불변이라는 특징 때문)
		// 변경이 적고 읽기만 하는 경우에는 불변 클래스인 String클래스가 용이하겠지만
		// 변경해야하는 값이 많은 경우 StringBuffer나 StringBuilder로 하는게 더 효율적임
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : "+buffer1.capacity()); //수용량
		System.out.println("buffer1에 들어있는 실제 값의 길이 : "+buffer1.length());
		
		System.out.println();
		
		//초기용량 지정하기
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : "+buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : "+buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity()); //16+3
		System.out.println("buffer3에 들어있는 실제 값의 길이 : "+buffer3.length());
		
		System.out.println();
		
		//buffer와 builder의 차이점은 쓰레드 safe 기능 제공 유무
		StringBuilder builder = new StringBuilder("abc"); //16+3
		System.out.println("초기 builder의 수용량 : "+builder.capacity());
		System.out.println("builder에 들어있는 실제 값의 길이 : "+builder.length());
		
		System.out.println();
		
		//값을 집어넣을때는 append 사용
//		builder.append("abc"); //StringBuilder가 반환 값
//		System.out.println("abc 추가 후의 builder : "+builder);
//		System.out.println("abc 추가 후의 builder 용량 : "+builder.capacity());
//		System.out.println("abc 추가 후의 builder 길이 : "+builder.length());
//		
//		builder.append("def");
//		System.out.println("def 추가 후의 builder : "+ builder);
//		System.out.println("def 추가 후의 builder 용량 : "+ builder.capacity());
//		System.out.println("def 추가 후의 builder 길이 : "+ builder.length());
		
//		메소드 체이닝 예제
		builder.append("abc").append("def"); //가능 메소드뒤에 메소드 또 쓰는거 : 메소드 체이닝
//		//왜? => append의 반환값 = StringBuilder
//		builder.append("ghi").toString().equals("abcdefghi"); // 메소드 체이닝
//		---------------------
//		반환값 :StringBuilder
//		--------------------------------
//		                             반환값 : String
//		메소드 체이닝은 String에서만 쓸수있음
		System.out.println("abc, def 추가 후의 builder : "+builder);
		System.out.println("abc, def 추가 후의 builder 용량 : "+builder.capacity());
		System.out.println("abc, def 추가 후의 builder 길이 : "+builder.length());
		
		//값 넣기 insert
		builder.insert(2,"zzz");
		System.out.println("인덱스2에 zzz 추가 후의 builder : "+builder);
		
		System.out.println();
		
		//삭제 delete
		builder.delete(2, 5); //start <= 인덱스 < end 자바에서만 끝에는 포함 안함
		System.out.println("인덱스 2부터 인데스 5까지 삭제 후의 builder : "+builder);
		
		System.out.println();
		
		//거꾸로 출력하기 reverse 
		builder.reverse();
		System.out.println("reverse 후의 builder : "+builder);
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2,"yy").reverse().delete(1, 3);
//		         abczzz   ->    abyyczzz ->  zzzcyyba -> zcyyba
		System.out.println(sb); 
	}
	public void method3() {
		//String 안에 있는 메소드
		String str = "Hello World";
		
		// 1. charAt(int index):char
		// 		String의 index번째 char 반환
		char ch =str.charAt(4);
		System.out.println(ch);
		// 2. concat(String str):String
		// 매개변수로 들어온 값을 원래 String의 끝에 이어붙인 값(String)을 반환
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : "+ concatStr);
		//+=도 같은 기능
		str += "!!!";
		System.out.println(str);
		// 3. equals():boolean
		//문자열 비교
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		// 4. substring(int beginIndex):String
//	 	      substring(int beginIndex, int endIndex):String
		//	String의 일부를 반환 - 매개변수가 하나면, 그 인덱스부터 끝까지 반환
		// 					- 매개변수가 두개면, 시작 인덱스 <= 문자 < 끝 인덱스
		// 지정한 인덱스 번호부터 끝까지 반환
		System.out.println("str.substring(6) : "+ str.substring(6));
		// 지정한 범위만 반환 (시작 <= 문자 < 끝)
		System.out.println("str.substring(0, 5) : "+str.substring(0, 5)); //0번째 인덱스부터 5번째 인덱스 전까지
		// 5. replace(char oldChar, char newChar):String
		// oldChar로 지정한 문자를 newChar로 대체하여 반환
		// 지정  char를 새로운 char로 대체하여 반환
		System.out.println("str.replace('l', 'e') : "+str.replace('l','e'));
		
		// 6. toUpperCase()/toLowerCase():String
		// 		모두 대문자 혹은 소문자로 바꿔서 변환
		// yes/no 입력받을때 사용가능 조건 2개를 만들필요가 없이 하나만 지정해주면 됨
		System.out.println("str.toUpperCase() : "+str.toUpperCase()); // 대문자로 바꾸기
		System.out.println("str.toLowerCase() : "+str.toLowerCase()); // 소문자로 바꾸기
		
		// 7. equalsIgnoreCase():boolean
		// 문자열 비교할때 대소문자 구분하지 않고 그 안에 들어가는 문자가 철자가 맞으면 같다고 봄
		// 대소문자 가리지 않고 비교
		// toupperCase() 나 equalsIgnoreCase() 사용하면 조건개수 줄일수있음
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.eqauls(str3) : "+ str2.equals(str3));
		System.out.println("str2.eqaulsIgnoreCase(str3) : "+ str2.equalsIgnoreCase(str3));
		
		// 8. trim():String
		// 앞/뒤에 있는 공백(빈 공간)을 제거한 문자열 반환
		// 앞/뒤에 있는 공백만 제거하는거라서 글자와 글자 사이에 있는 공백은 제거하지않음
		String str4 = "    Java";
		String str5 = "Java    ";
		String str6 = "    Ja va     ";
		System.out.println(str4+ "| str4.trim() : "+ str4.trim());
		System.out.println(str5+ "| str5.trim() : "+ str5.trim());
		System.out.println(str6+ "| str6.trim() : "+ str6.trim());
		
		// 9. spilt(String str):String[]
		//     문자열을 분리하여 배열에 담아 반환 하는 메소드
		// 		String str
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] spiltArr = splitStr.split(", ");
		System.out.println("분리된 문자열 개수(split) : "+spiltArr.length);
		//일반 for문
		for(int i =0; i<spiltArr.length;i++) {
			System.out.print(spiltArr[i]+ " ");
		}
		System.out.println();
		//향상된 for문 (for-each문) - 문제 출제 예상
		for(String s : spiltArr) {
			System.out.print(s + " ");
		}
		// splitArr : 돌릴(반복할) 대상
		// String s : 임시 저장후 출력(대상의 자료형)
		// splitArr을 String s에 임시저장하고 출력하고 다음으로 넘어가서 반복
		// 알아서 자기가 끝까지 돌음
	}
	public void method4() {
		//StringTokenizer 클래스
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : "+stObj.countTokens());
		//hasMoreTokens - 다음 토큰이 있니?/ nextToken - 다음 토큰 꺼내기
		while(stObj.hasMoreTokens()) {
			System.out.println(stObj.nextToken());
		} 
		System.out.println("값을 꺼낸 후의 문자열 개수 : "+stObj.countTokens());//없는데용?
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2,", -*#");
		System.out.println("분리된 문자열 개수 : "+stObj2.countTokens());
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		
		//split()과 StringTokenizer의 차이점
		// 1. 분리한 문자열을 String[]로 처리하고 싶을 때 split() 메소드
		//   분리한 문자열을 객체로 처리하고 싶을 때 StringTokenizer 클래스
		// 2. split()메소드의 구분자는 1개
		//	  StringTokenizer클래스의 구분자는 여러 개
		
	}
}
