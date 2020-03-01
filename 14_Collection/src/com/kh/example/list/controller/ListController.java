package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		List list1 = new ArrayList();
//		list1.
		//List is a raw type. References to generic type List<E> should be parameterized
		// 제네릭 지정 안하면 노란줄  제네릭 지정안하면 자동으로 Object로 지정되는데 Object는 모든 클래스의 최상위 클래스
		// Object여서 모든 자식들을 받을수 있어서 컬렉션의 장점인 3번이 적용이 되는거임~! 근데 지정안하는 경우 거의 없음
		//제네릭 지정하기 : 앞에거 쓰면 뒤에꺼는 <>만 써도 됨 자바 버전마다 적용이 될수도 있고 안될수도있음 
		
		List<Student> list = new ArrayList<Student>(3);  //()안에 지정할 크기 입력
		//add(E e) : 리스트 끝에 데이터 e 추가
		list.add(new Student("테스트",0));
		list.add(new Student("도대담",60));
		
		System.out.println("list : "+list);
		
		// 컬렉션 장점 1. 크기의 제약이 없다.
		list.add(new Student("남나눔",90));
		list.add(new Student("하현호",85));
		
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		list.add(new Student("문미미",66));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		// 컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리가 간단하다.
		//추가
		// add(int index, E e) : index번째 인덱스에 e 추가
		list.add(0, new Student("류라라",100)); //0번째 인덱스에 추가하기 
		System.out.println("list : "+ list);
		
		list.add(3, new Student("강건강",40));
		System.out.println("list : "+list);
		
		//삭제
		// remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);
		System.out.println("list : "+list);
		
		// remove(Object o) : 해당 Object객체 삭제
		list.remove(new Student("강건강",40));  //객체주소로 비교해서 지우는데 주소값이 달라서 <<= 이렇게만 쓰면 안지워짐
		//Object메소드에 있는 equals메소드와 hashcode메소드 두개를 오버라이딩해서 재정의 해야함
		//주소값이 아닌 안에 있는 필드값을 비교해서 같으면 삭제
		System.out.println("list : "+list);
		
		// 정렬
		// 정렬 방법 1번째 : Collections 클래스 이용 / 컬렉션 사용할때 유용한 메소드를 모아놓은 클래스
		Collections.sort(list); //정렬기준이 없는데요? Comparable, Comparator 인터페이스 사용
		System.out.println("이름 오름차순 : "+ list);
		
		
		// 정렬 방법 2. List.sort()메소드 이용
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator());
		System.out.println("점수 오름차순 : "+list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		System.out.println(strList);
//		Collections.sort(strList); //String이 가지고 있는 정렬기준이 적용되서 오름차순 정렬
//		System.out.println(strList);
		
		// set(int index, E e) : index번째 인덱스에 있는 요소를 e로 수정
		System.out.println("list : "+ list);
		list.set(2, new Student("도대담",31));
		System.out.println("list : "+ list);
		
		// get(int index) : index번째 인덱스에 있는 요소를 가지고 옴/가지고만 오는거라서 리스트에서 빠지지는 않음
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list :" + list);
		
		// subList(int index1, int index2) : index1번째 인덱스부터 index2번째 인덱스까지 리스트 반환
		System.out.println("list 추출 : " + list.subList(2, 5)); //2번째 인덱스부터 5번째 인덱스 전까지 가져오기 
		
		// contains(Object o) : o가 리스트에 존재한다면 true 반환
		// indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 없다면 -1 반환
		// contains보다 indexOf를 더 많이 씀~ 반환값이 -1이 아니면~
		System.out.println("남나눔, 90이 있는가? : "+list.contains(new Student("남나눔",90)));
		System.out.println("남나눔, 90의 인덱스 위치는? : "+list.indexOf(new Student("남나눔",90)));
		System.out.println("테스트, 0의 인덱스 위치는? : "+ list.indexOf(new Student("테스트",0)));
		
		
		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println("list : "+list);
		System.out.println("list가 비었나요? : "+list.isEmpty());
		
	}
}
