package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
		
	// && : �ǿ����ڰ� ��� true�� �� true ��ȯ(�׸���, ~�鼭)
	// || : �ǿ����� �߿��� �ϳ��� true�� �� true��ȯ(�Ǵ�, ~�ų�)
	
	public void method1() {
		//�Է��� ���� ���� 1~100������ �������� Ȯ��
		//���� �ϳ� �Է� : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		//1~100 ������ ����
		//���ڰ� 1���� ũ�ų� ��!!��!! ,100���� �۰ų� ����. ==> &&(AND)
		System.out.println("1���� 100������ �������� Ȯ�� : " + (num >=1 && num <=100));
		
	}
	public void method2() {
		//�Է��� ���ڰ��� �빮������ Ȯ��
		//�����ϳ� �Է� : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isCap = (ch >= 'A' && ch <= 'Z'); //���� ���� ġȯ�Ǳ⶧���� ũ�� �۴ٷ� ǥ���Ҽ�����
		System.out.println("���� �빮�ڰ� �½��ϱ�? " + isCap);
		
		//��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ���:
		//����ϰڴٰ� �ϼ̽��ϱ�? : ______(�����)
		
		System.out.print("����Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		char yy = sc.nextLine().charAt(0);
		boolean yn = (yy == 'y' || yy == 'Y');
//		System.out.println("����ϰڴٰ� �ϼ̽��ϱ�? : " + yn);  //�ݺ���~!
		System.out.println("����ϰڴٰ� �ϼ̽��ϱ�? : " + (yy == 'y' || yy == 'Y'));
		
	}
}
