package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
	// 점수 오름차순
	// 비교 주체가 비교 대상보다 크면 양수
	// 비교 주체가 비교 대상보다 작으면 음수 
	// 비교 주체가 비교 대상과 같으면 0 반환
		
	int standard = o1.getScore(); // 주체
	int object = o2.getScore(); // 대상
	
	String standardName = o1.getName();
	String objectName = o2.getName();
	
	// 오름차순
	if(standard > object) {
		return 1;
	} else if(standard == object) {
//		return 0;
		return standardName.compareTo(objectName); // 점수가 같을때 이름을 오름차순으로 만들기
	} else {
		return -1;
		}
	}
	// 내림차순 : 각각 -1 곱하기
	
}
