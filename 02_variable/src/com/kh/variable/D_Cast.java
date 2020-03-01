package com.kh.variable;

public class D_Cast {
		public void rule1() {
			boolean flag = true;
			//boolean flag2 = 100;
			//Type mismatch: cannot convert from int to boolean
			//boolean 자료형은 무조건 true,false만 들어갈수있음 (형변환 예외)
			
			int num = 'A'; //크기적으로는 가능 , 문자랑 숫자는 유니코드로 인해서 호환이 가능함 A의 유니코드 = 65 이므로 결과값이 숫자 65가 나옴
			System.out.println("num: " + num);
			 
			char ch = 97; //리터럴
			System.out.println("ch : "+ ch); 
			
			char ch2 = (char)num; //변수 
			//Type mismatch: cannot convert from int to char
			//int 에서 char로 바꿀수가 없다 ~~~!!~! 
			//리터럴은 컴퓨터에서 알아서 계산해서 넣을수있는데 변수는 변수 자체의 크기만 볼수있음 
			//그래서 4바이트를 2바이트에 넣을수가 없어서 넣을려면 강제형변환이 필요함			
			System.out.println("ch2: " + ch2);
			
			int num2 = -97;
			char ch3 = (char)num2; //char는 양수만 저장할수있는데 음수가 들어가버려서 범위내에서 찾을수가 없어서 없는 문자라고 결과값이 ?이 뜸
			System.out.println("ch3 : " + ch3);
		}
		public void rule2() {
			int iNum = 10;
			long lNum = 100;
			
			//int result = iNum + lNum; // int + long = long 을 int에 집어 넣겠다는건데 큰거를 작은거로 넣을때  형변환 안하면 에러남 
			//Type mismatch: cannot convert from long to int
			//연산은 큰 자료형으로 자동 형변환이 된 후 연산처리가 되기 때문에 
			//iNum + lNum의 결과는 long형이 된 상태 
			//근데 근데 그 결과값을 int형에 넣으려고 하니 오류가 남 
			
			//iNum + lNum을 int result에 저장할 수 있는 방법
			//방법 1. 수행결과를 int로 강제 형변환
			int result = (int)(iNum + lNum);
			
			//방법 2. long형을 int로 강제 형변환
			int result2 = iNum + (int)lNum;
			
			//번외. 결과 값을 저장하는 result를 long형으로 받기
			long result3 = iNum + lNum;
			
		}
		//데이터 손실
		public void rule3() {
			int iNum = 290;
			
			byte bNum = (byte)iNum; // int를 byte로 형변환 하면서 데이터 손실이 일어남
			
			System.out.println("bNum : " + bNum);
			//형변환을 하면서 데이터가 손실이 되서 결과값이 달라짐
			
		}
}
