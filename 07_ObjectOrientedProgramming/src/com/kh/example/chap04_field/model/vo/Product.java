package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "��������";
	private String brand = "������";
	private int price = 1500; 
	private static int num = 100;
	
	//�ν���Ʈ �ʱ�ȭ �� : ��ü ������ ���� �ʱ�ȭ
	{
		name ="ĭ��";
		price = 1000;
		brand = "�Ե�";
		num -= 10; //static ������ �ִ°� ������ �ͼ� ����X
	}
	//���۽� �ѹ��� �ʱ�ȭ
	static { //���α׷� �������ڸ��� �ö󰡴°�
		//static�� ���⶧���� �ν��Ͻ� ����
		//��ü�� ����������� �޸� ������ �ö󰡴°�
//		name ="Ȩ����";
//		brand ="����";
//		price = 2000;
		//������ ������ static�� ���������� 
		num = 150;
		num--;
		//����
		//Cannot make a static reference to the non-static field name
		//���� ������ �޶� ����
	}
	
	
	public void inform() {
		System.out.println(name +", "
						+ brand +", "
						+ price +", "+num);
	}
}
