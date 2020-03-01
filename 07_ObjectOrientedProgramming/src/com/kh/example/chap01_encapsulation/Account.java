package com.kh.example.chap01_encapsulation;

public class Account {
	//���� �����ڴ� �ڷ��� �տ� ����
	//��� ���� : Ŭ���� ������ �ִ� ����
	//��� ���� = ��� �ʵ� = �ʵ� = ���� ����
	//�ڹٿ��� ��� ���� ����Ҷ��� private ����� (���ܵ� �ֱ����)
	private String name = "������";
	private String phone = "010-9078-3699";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //�ܾ�	
	
	//�Ա� �޼ҵ� 
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name+ "���� ���¿�" + money +"���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	//��� �޼ҵ� 
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name+"���� ���¿��� "+money +"���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	public void displayBalance() {
		System.out.println(name +"���� ���¿� �ܾ��� "+balance+"���Դϴ�.");
	}
}
