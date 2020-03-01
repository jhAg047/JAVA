package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account(); //heap������ ��ü ���� : �ν��Ͻ�ȭ
		
		//���� �ܾ� ��ȸ 
		a.displayBalance();
		
		//�Ա�
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		//���
		a.withdraw(500000);// �޼ҵ带 ���� ����
		a.displayBalance();
		
//		a.balance -= 2000000; //������ private�� �Ȱɾ���� ���� ����
		//private �ɾ���� ������
		//The field Account.balance is not visible : �ʵ忡 balance�� �Ⱥ��δ�!
		//private�� �� �ڽ�,����Ŭ����(Account)������ �� �� �ְԲ� �������ֱ� ������
		//�ܺ� Ŭ������ Run������ �� �� ����
		
		a.withdraw(500000);
		a.displayBalance();
	}
}
