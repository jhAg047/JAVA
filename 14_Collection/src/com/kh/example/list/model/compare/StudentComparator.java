package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
	// ���� ��������
	// �� ��ü�� �� ��󺸴� ũ�� ���
	// �� ��ü�� �� ��󺸴� ������ ���� 
	// �� ��ü�� �� ���� ������ 0 ��ȯ
		
	int standard = o1.getScore(); // ��ü
	int object = o2.getScore(); // ���
	
	String standardName = o1.getName();
	String objectName = o2.getName();
	
	// ��������
	if(standard > object) {
		return 1;
	} else if(standard == object) {
//		return 0;
		return standardName.compareTo(objectName); // ������ ������ �̸��� ������������ �����
	} else {
		return -1;
		}
	}
	// �������� : ���� -1 ���ϱ�
	
}
