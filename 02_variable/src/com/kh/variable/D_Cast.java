package com.kh.variable;

public class D_Cast {
		public void rule1() {
			boolean flag = true;
			//boolean flag2 = 100;
			//Type mismatch: cannot convert from int to boolean
			//boolean �ڷ����� ������ true,false�� �������� (����ȯ ����)
			
			int num = 'A'; //ũ�������δ� ���� , ���ڶ� ���ڴ� �����ڵ�� ���ؼ� ȣȯ�� ������ A�� �����ڵ� = 65 �̹Ƿ� ������� ���� 65�� ����
			System.out.println("num: " + num);
			 
			char ch = 97; //���ͷ�
			System.out.println("ch : "+ ch); 
			
			char ch2 = (char)num; //���� 
			//Type mismatch: cannot convert from int to char
			//int ���� char�� �ٲܼ��� ���� ~~~!!~! 
			//���ͷ��� ��ǻ�Ϳ��� �˾Ƽ� ����ؼ� �������ִµ� ������ ���� ��ü�� ũ�⸸ �������� 
			//�׷��� 4����Ʈ�� 2����Ʈ�� �������� ��� �������� ��������ȯ�� �ʿ���			
			System.out.println("ch2: " + ch2);
			
			int num2 = -97;
			char ch3 = (char)num2; //char�� ����� �����Ҽ��ִµ� ������ �������� ���������� ã������ ��� ���� ���ڶ�� ������� ?�� ��
			System.out.println("ch3 : " + ch3);
		}
		public void rule2() {
			int iNum = 10;
			long lNum = 100;
			
			//int result = iNum + lNum; // int + long = long �� int�� ���� �ְڴٴ°ǵ� ū�Ÿ� �����ŷ� ������  ����ȯ ���ϸ� ������ 
			//Type mismatch: cannot convert from long to int
			//������ ū �ڷ������� �ڵ� ����ȯ�� �� �� ����ó���� �Ǳ� ������ 
			//iNum + lNum�� ����� long���� �� ���� 
			//�ٵ� �ٵ� �� ������� int���� �������� �ϴ� ������ �� 
			
			//iNum + lNum�� int result�� ������ �� �ִ� ���
			//��� 1. �������� int�� ���� ����ȯ
			int result = (int)(iNum + lNum);
			
			//��� 2. long���� int�� ���� ����ȯ
			int result2 = iNum + (int)lNum;
			
			//����. ��� ���� �����ϴ� result�� long������ �ޱ�
			long result3 = iNum + lNum;
			
		}
		//������ �ս�
		public void rule3() {
			int iNum = 290;
			
			byte bNum = (byte)iNum; // int�� byte�� ����ȯ �ϸ鼭 ������ �ս��� �Ͼ
			
			System.out.println("bNum : " + bNum);
			//����ȯ�� �ϸ鼭 �����Ͱ� �ս��� �Ǽ� ������� �޶���
			
		}
}
