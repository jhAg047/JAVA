package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // �Ϲ� ���� ����
		//int AGE; �̷��Ը� ���� ������� ���� �տ� final �����
		final int AGE; // ��� ����
		
		age=20;
		AGE=20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// ������ �� ����
		age = 30;
//		AGE = 30;  ��ĥ���ִ� ��� ���� �׳� �ּ�ó�� �ϱ�
		//The final local variable AGE may already have been assigned
		//final���� �� ����� �ѹ��� ���� �����Ҽ��ִµ� �̹� 20�� �Ҵ�Ǿ��־ �� �Ҵ��Ϸ���  ������ ����~!
		//: AGE�� final�� ���� ����ε�, ����� �� ���� ���� �����Ҽ��ְ� �� ������ �Ұ�����
		// �׷��� 16��° �ٿ��� AGE�� 30�̶�� ������ ������ �Ϸ����ϴ� ���� ���ؼ� ������ �Ұ����ϴٸ鼭 ������
		
		System.out.println("�� ���� �� age : " + age);
		System.out.println("�� ������ AGE : " + AGE);
	}
}
