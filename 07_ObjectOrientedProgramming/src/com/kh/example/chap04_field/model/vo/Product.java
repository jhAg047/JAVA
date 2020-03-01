package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500; 
	private static int num = 100;
	
	//인스턴트 초기화 블럭 : 객체 생성시 마다 초기화
	{
		name ="칸초";
		price = 1000;
		brand = "롯데";
		num -= 10; //static 영역에 있는거 가지고 와서 문제X
	}
	//시작시 한번만 초기화
	static { //프로그램 시작하자마자 올라가는거
		//static이 없기때문에 인스턴스 변수
		//객체가 만들어졌을때 메모리 영역에 올라가는거
//		name ="홈런볼";
//		brand ="해태";
//		price = 2000;
		//시점이 동일한 static만 넣을수있음 
		num = 150;
		num--;
		//오류
		//Cannot make a static reference to the non-static field name
		//생성 시점이 달라서 오류
	}
	
	
	public void inform() {
		System.out.println(name +", "
						+ brand +", "
						+ price +", "+num);
	}
}
