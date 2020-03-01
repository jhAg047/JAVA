package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/* 
	 	while(���ǽ�) {
	 		���� ����
	 		[������ or �б⹮;] //[] ���� ����!
	 	}
	 	���ǽ� Ȯ�� -> (���ǽ� true�� ��) ���� ���� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	 	���ǽ� ����� false�� �� ������ �ݺ�
	 	
	 */
	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "��° �ݺ��� ����");
			i++; //�� �Ʒ��� �����ʿ�� ���µ� ������ �������� �������� ���� �����
		}
	}
	public void method1_1() {
		//�ڱ� �Ұ� �ټ� �� �ϱ� : �� �̸��� �������̾�
		int i = 0;
		while (i<5) {
			System.out.println("�� �̸��� �������̾�");
			i++;
		}
	}
	public void method2() {
		// 5���� 1���� ���
		int i = 5;
		while (i>=1) {
			System.out.println(i);
			i--;
		}
	}
	public void method3() {
		//1���� 10������ Ȧ���� ���
		int i = 1;
		while (i<= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ���
		// ���� �� ���� �Է��ϼ���.
		// ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		// ù ��° ����:
		// �� ��° ����:
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���");
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ����  : ");
		int end = sc.nextInt();
		int min,max = 0;
		if (start > end) {
			min = end;
			max = start;
		} else {
			min = start;
			max = end;
		}
		while (min <= max) {
			System.out.print(min+ " ");
			min++;
		}
		
	}
	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���
		// ���ǽ� ���� ������ 1~9 ������ ����� �Է��Ͽ����մϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ���� �ϳ��� �Է��ϼ��� : ");
		int i = sc.nextInt();
		int a = 1;
		if (i >= 1 && i <= 9) {
			while (a <= 9) {
				System.out.printf("%d * %d = %d%n",i,a,(i*a));
				a++; // ������ ����� �ʱ�~~!
			}
		} else {
			System.out.println("1���� 9������ ����� �Է��Ͽ��� �մϴ�");
		}	
		}
	public void method5() {
		//1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ� ���
		 int random = (int)(Math.random()* 10+1);
		 int sum = 0;
		 int i = 1;
		 while(i <= random) {
			 sum += i;
			 i++;
		 }
		 System.out.printf("1���� %d������ ���� �հ� : %d",random,sum);
	}
	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple	���ڿ� �Է� : love
		// 0 : a			0 : l
		// 1 : p			1 : o
		// 2 : p			2 : v
		// 3 : l			3 : e
		// 4 : e
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); //apple	
		//���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� :length() 
		int length = str.length();
		System.out.println(str + "�� ���� : " + length);
		//for
//		for (int i = 0;i < length; i++) {
//		for (int i = 0;i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i+" : " + ch);
//		}
		//while
		int i = 0;
		while (i < length) {
			char ch = str.charAt(i);
			System.out.println(i+" : " + ch);
			i++;
		}
	}
	public void method7() {
		//2�ܺ��� 9�ܱ��� ���
		int a = 2;
		while (a <= 9) {
			int b = 1; 
			while (b <= 9) {
				System.out.printf("%d * %d = %d%n",a,b,(a*b));
				b++;
			}	
			a++;
			System.out.println();
		}
	}
	public void method8() {
		//�Ƴ��α� �ð�
		int h = 0;
		while (h <= 24) {
			int m = 0;
			while(m < 60) {
				System.out.printf("%02d�� %02d��%n",h,m);
				//%2d : 2�ڸ� Ȯ���ϰ� ���� �ֱ�  (��ĭ�� ���ؼ� ������ ����)
				//%-2d : 2�ڸ� Ȯ���ϰ� ���� �ֱ� (��ĭ�� ���ؼ� ���� ����)
				m++;
			} 
			h++;
		}
	}
	public void method9() {
		Scanner sc = new Scanner(System.in);
		//���� ��
		int menuNum = 0 ; 
		while(menuNum != 9) { //menuNum�� 9�� �ƴҶ� ���� ~!
		System.out.println("1. 1~5���� ���");
		System.out.println("2. 5~1���� ���");
		System.out.println("3. 1���� 10���� Ȧ�� ���");
		System.out.println("9. ����");
		System.out.print("�޴� ���� : ");
		menuNum = sc.nextInt(); //���ο� ������ ����°� �ƴ� ������ Ȱ���ϴ°�
		switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		}
	}
}