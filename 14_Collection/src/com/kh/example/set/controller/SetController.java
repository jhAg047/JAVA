package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		// 다형성 적용
		// 노란줄 뜨는 이유 : 제네릭 설정 안해서
		Set<Dog> set = new HashSet<Dog>();
		
		//데이터 담기
		//set,list Collection후손
		set.add(new Dog("샤샤",4.0)); // 주소값으로 비교하는거 new 연산자 때문에 주소값이 달라서 중복저장이 가능
		set.add(new Dog("호두",4.5));
		set.add(new Dog("우유",8.0));
		System.out.println(set);
		set.add(new Dog("샤샤",4.0)); // 주소값으로 비교하는거임!! Dog에서 오버라이딩 해야함
		System.out.println(set);
		//set에서 사용할수있는 메소드는 list와 거의 비슷함
		
		//String은 equals와 hashcode가 이미 오버라이딩 되어있음
//		Set<String> test = new HashSet<String>();
//		test.add("예시1");
//		test.add("예시2");
//		test.add("예시3");
//		System.out.println(test);
//		test.add("예시2");
//		System.out.println(test);
		
		//LinkedHashSet : HashSet과 동일하지만 순서를 유지한다는 점이 다름,중복저장불가
		
		Set<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("초코",2.1));
		set2.add(new Dog("콩이",8.3));
		set2.add(new Dog("두부",5.0));
		set2.add(new Dog("초코",2.1)); //순서는 유지되고 중복 저장은 안되는 LinkedHashSet
		System.out.println(set2);
		
		set2.add(new Dog("로이",6.1));
		set2.add(new Dog("공주",5.2));
		set2.add(new Dog("왕자",9.5));
		set2.add(new Dog("조이",12.5));
		System.out.println(set2);
		
		//TreeSet(Collection<? extends E> c)
		//TreeSet : 자동 정렬 / 
		// 이름에 대한 오름차순
		Set<Dog> set3= new TreeSet<Dog>(set2); // 정렬기준이 없어서 에러뜸 Comparable / Comparator 사용해서 정렬기준세워야함
		System.out.println(set3);
		

		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("초코",6.1));
		set4.add(new Dog("콩이",8.3));
		set4.add(new Dog("두부",5.0));
		set4.add(new Dog("초코",2.1)); 
		set4.add(new Dog("로이",6.1));
		set4.add(new Dog("공주",5.2));
		set4.add(new Dog("왕자",9.5));
		set4.add(new Dog("조이",12.5));
		System.out.println(set4);
		
		// 요소 뽑아내기 
		// 방법 1. Set을 List화 시키기 : addAll() 사용 안에있는 요소들을 한번에 다 집어넣기
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		
		System.out.println("방법 2");
		// 방법 2. Iterator 활용하기  : iterator()
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println("re : " + it.next()); // 이미 맨 끝에 가있기때문에 다시 돌아와서 읽을수가 없음 단방향,일회성
		}
			
		
	}
}
