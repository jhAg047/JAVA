package com.kh.example.test.model.vo;

//��� ǥ����
public class Child2 extends Parent{ //Child2�� Parent�� ��� �ްڴ� Ctrl+space�� ��ӹ����� Ȯ�ΰ��� 
	//Ȯ��
	private String str;
	public Child2() {
		//��ü ������ ���� �� �ʿ䰡 ����
//		super.num= 10; 
		//num�� ���������� private 
		//(���� ������ Parent���̱� ������ �Ұ���)
		super.dNum = 10.2; 
		//���� ������ ���� ��Ű���̱� ������ ����
		super.bool = false;
		//���� ������ ���� ��Ű���̰� �ļ��̱� ������ ����
		super.ch = 'a';
		//���� ������ ��ü ���̱� ������ ����
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
