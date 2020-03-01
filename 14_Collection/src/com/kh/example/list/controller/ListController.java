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
		// ���׸� ���� ���ϸ� �����  ���׸� �������ϸ� �ڵ����� Object�� �����Ǵµ� Object�� ��� Ŭ������ �ֻ��� Ŭ����
		// Object���� ��� �ڽĵ��� ������ �־ �÷����� ������ 3���� ������ �Ǵ°���~! �ٵ� �������ϴ� ��� ���� ����
		//���׸� �����ϱ� : �տ��� ���� �ڿ����� <>�� �ᵵ �� �ڹ� �������� ������ �ɼ��� �ְ� �ȵɼ������� 
		
		List<Student> list = new ArrayList<Student>(3);  //()�ȿ� ������ ũ�� �Է�
		//add(E e) : ����Ʈ ���� ������ e �߰�
		list.add(new Student("�׽�Ʈ",0));
		list.add(new Student("�����",60));
		
		System.out.println("list : "+list);
		
		// �÷��� ���� 1. ũ���� ������ ����.
		list.add(new Student("������",90));
		list.add(new Student("����ȣ",85));
		
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		list.add(new Student("���̹�",66));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		// �÷��� ���� 2. �߰�/����/���� ���� ���ó���� �����ϴ�.
		//�߰�
		// add(int index, E e) : index��° �ε����� e �߰�
		list.add(0, new Student("�����",100)); //0��° �ε����� �߰��ϱ� 
		System.out.println("list : "+ list);
		
		list.add(3, new Student("���ǰ�",40));
		System.out.println("list : "+list);
		
		//����
		// remove(int index) : �ش� index��° ��ü ����
		list.remove(1);
		System.out.println("list : "+list);
		
		// remove(Object o) : �ش� Object��ü ����
		list.remove(new Student("���ǰ�",40));  //��ü�ּҷ� ���ؼ� ����µ� �ּҰ��� �޶� <<= �̷��Ը� ���� ��������
		//Object�޼ҵ忡 �ִ� equals�޼ҵ�� hashcode�޼ҵ� �ΰ��� �������̵��ؼ� ������ �ؾ���
		//�ּҰ��� �ƴ� �ȿ� �ִ� �ʵ尪�� ���ؼ� ������ ����
		System.out.println("list : "+list);
		
		// ����
		// ���� ��� 1��° : Collections Ŭ���� �̿� / �÷��� ����Ҷ� ������ �޼ҵ带 ��Ƴ��� Ŭ����
		Collections.sort(list); //���ı����� ���µ���? Comparable, Comparator �������̽� ���
		System.out.println("�̸� �������� : "+ list);
		
		
		// ���� ��� 2. List.sort()�޼ҵ� �̿�
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator());
		System.out.println("���� �������� : "+list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
//		System.out.println(strList);
//		Collections.sort(strList); //String�� ������ �ִ� ���ı����� ����Ǽ� �������� ����
//		System.out.println(strList);
		
		// set(int index, E e) : index��° �ε����� �ִ� ��Ҹ� e�� ����
		System.out.println("list : "+ list);
		list.set(2, new Student("�����",31));
		System.out.println("list : "+ list);
		
		// get(int index) : index��° �ε����� �ִ� ��Ҹ� ������ ��/������ ���°Ŷ� ����Ʈ���� �������� ����
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list :" + list);
		
		// subList(int index1, int index2) : index1��° �ε������� index2��° �ε������� ����Ʈ ��ȯ
		System.out.println("list ���� : " + list.subList(2, 5)); //2��° �ε������� 5��° �ε��� ������ �������� 
		
		// contains(Object o) : o�� ����Ʈ�� �����Ѵٸ� true ��ȯ
		// indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ���ٸ� -1 ��ȯ
		// contains���� indexOf�� �� ���� ��~ ��ȯ���� -1�� �ƴϸ�~
		System.out.println("������, 90�� �ִ°�? : "+list.contains(new Student("������",90)));
		System.out.println("������, 90�� �ε��� ��ġ��? : "+list.indexOf(new Student("������",90)));
		System.out.println("�׽�Ʈ, 0�� �ε��� ��ġ��? : "+ list.indexOf(new Student("�׽�Ʈ",0)));
		
		
		// clear() : ����� ��� ��ü ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println("list : "+list);
		System.out.println("list�� �������? : "+list.isEmpty());
		
	}
}
