package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		//Person객체가 들어갈수있는 5개의 공간 생성
		Person[] pArr = new Person[5];
		
		System.out.println("pArr : "+pArr); //person이 들어갈수있는 공간에 대한 주소값
		for(int i =0;i<pArr.length;i++) {
			System.out.println("pArr["+i+"] :"+pArr[i]);
		}
		// 각 인덱스 별로 객체를 생성하여 대입하기
		pArr[0] = new Person("강건강",20,'남',175.8,66.9);	 //매개변수 생성자를 통한 필드 초기화
		pArr[1] = new Person("남나눔",34,'남',179.5,96.1);
		pArr[2] = new Person("도대담",14,'남',190.0,77.3);
		pArr[3] = new Person("류라라",27,'여',161.4,56.8);
		pArr[4] = new Person("문미미",53,'여',157.9,58.3);
		
		//pArr[i]만 쓰면 객체의 주소값 출력
		//pArr[i]만 쓰면 해당 객체의 주소값만 출력하기 때문에.을 이용해서 personInfo() 메소드 호출
		for(int i =0;i<pArr.length;i++) {
			System.out.println("pArr["+i+"] : "+pArr[i].personInfo());
		}	
	}
	public void method2() {
//		pArr[0] = new Person("강건강",20,'남',175.8,66.9);	 
//		pArr[1] = new Person("남나눔",34,'남',179.5,96.1);
//		pArr[2] = new Person("도대담",14,'남',190.0,77.3);
//		pArr[3] = new Person("류라라",27,'여',161.4,56.8);
//		pArr[4] = new Person("문미미",53,'여',157.9,58.3);
		
		Person[] pArr = {new Person("강건강",20,'남',175.8,66.9),
					     new Person("남나눔",34,'남',179.5,96.1),
					     new Person("도대담",14,'남',190.0,77.3),
					     new Person("류라라",27,'여',161.4,56.8),
					     new Person("문미미",53,'여',157.9,58.3)};
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i].getName()+"님의 정보 :"+pArr[i].personInfo());
		}
		}	
	}
