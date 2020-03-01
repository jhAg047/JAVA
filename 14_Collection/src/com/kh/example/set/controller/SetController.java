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
		// ������ ����
		// ����� �ߴ� ���� : ���׸� ���� ���ؼ�
		Set<Dog> set = new HashSet<Dog>();
		
		//������ ���
		//set,list Collection�ļ�
		set.add(new Dog("����",4.0)); // �ּҰ����� ���ϴ°� new ������ ������ �ּҰ��� �޶� �ߺ������� ����
		set.add(new Dog("ȣ��",4.5));
		set.add(new Dog("����",8.0));
		System.out.println(set);
		set.add(new Dog("����",4.0)); // �ּҰ����� ���ϴ°���!! Dog���� �������̵� �ؾ���
		System.out.println(set);
		//set���� ����Ҽ��ִ� �޼ҵ�� list�� ���� �����
		
		//String�� equals�� hashcode�� �̹� �������̵� �Ǿ�����
//		Set<String> test = new HashSet<String>();
//		test.add("����1");
//		test.add("����2");
//		test.add("����3");
//		System.out.println(test);
//		test.add("����2");
//		System.out.println(test);
		
		//LinkedHashSet : HashSet�� ���������� ������ �����Ѵٴ� ���� �ٸ�,�ߺ�����Ұ�
		
		Set<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("����",2.1));
		set2.add(new Dog("����",8.3));
		set2.add(new Dog("�κ�",5.0));
		set2.add(new Dog("����",2.1)); //������ �����ǰ� �ߺ� ������ �ȵǴ� LinkedHashSet
		System.out.println(set2);
		
		set2.add(new Dog("����",6.1));
		set2.add(new Dog("����",5.2));
		set2.add(new Dog("����",9.5));
		set2.add(new Dog("����",12.5));
		System.out.println(set2);
		
		//TreeSet(Collection<? extends E> c)
		//TreeSet : �ڵ� ���� / 
		// �̸��� ���� ��������
		Set<Dog> set3= new TreeSet<Dog>(set2); // ���ı����� ��� ������ Comparable / Comparator ����ؼ� ���ı��ؼ�������
		System.out.println(set3);
		

		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("����",6.1));
		set4.add(new Dog("����",8.3));
		set4.add(new Dog("�κ�",5.0));
		set4.add(new Dog("����",2.1)); 
		set4.add(new Dog("����",6.1));
		set4.add(new Dog("����",5.2));
		set4.add(new Dog("����",9.5));
		set4.add(new Dog("����",12.5));
		System.out.println(set4);
		
		// ��� �̾Ƴ��� 
		// ��� 1. Set�� Listȭ ��Ű�� : addAll() ��� �ȿ��ִ� ��ҵ��� �ѹ��� �� ����ֱ�
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		
		System.out.println("��� 2");
		// ��� 2. Iterator Ȱ���ϱ�  : iterator()
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println("re : " + it.next()); // �̹� �� ���� ���ֱ⶧���� �ٽ� ���ƿͼ� �������� ���� �ܹ���,��ȸ��
		}
			
		
	}
}
