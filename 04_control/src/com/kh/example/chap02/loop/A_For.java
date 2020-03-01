package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 	for(�ʱ��; ���ǽ�; ������){
	 		���� ����;
	 	}
	 	�ʱ�� -> ���ǽ� -> (���ǹ��� true�϶�)���� ���� -> ������ -> ���ǽ� -> (�ݺ�)
	 	���ǽ� ����� false�� �� ������ �ݺ�
	 	������ : �ݺ����� ���������� �ϳ��� ��ġ
	 	�������� ������ �ݺ����� �ȳ��� 
	 	
	 	for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
	 	������, ��� �������� �� �ݺ����� �������� ���⶧����
	 	for�� ���̳� �ۿ��ٰ� �ʱ���� �����α� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ���ؾ���
	 	�� for() �ȿ����� ������ �� ��� �ʿ��� �����
	 	
	 */
	public void method1() {
		// 1���� 5���� ���
		for (int num = 1; num <= 5; num++) {
			System.out.println(num + "��° �ݺ��� ����");
		}
	}
	public void method1_1() {
		//�ڱ� �Ұ� �ټ��� �ϱ�  : ���̸��� �������̾�
		for (int num = 0; num < 5; num++) {
			System.out.println("���̸��� �������̾�");
		}

	}
	public void method2() {
		//5���� 1���� ����ϱ�
//		for(int num=5; num > 0 ; num--) {
//			System.out.println(num);
//		}
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(6-i);
//		}
	}
	public void method2_1() {
		//8���� 3���� ���
		for(int i = 8; i >= 3;i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		for (int i=1; i <= 10;i+=2) {
			System.out.print(i+" ");
		}
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
		}
	}
	public void method4() {
		//���� 2���� �Է¹޾Ƽ� �� ���� ���ڸ� ����ϼ���
		/* 
		 ���� �� ���� �Է��ϼ���.
		 ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		 ù ��° ����: 1
		 �� ��° ����: 5
		 1 2 3 4 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		int max,min = 0;
		if (start > end) {
			max = start;
			min = end;
		}
		else {
			max = end;
			min = start;
		}
		
//		for (int i = min; i <= max; i++) {
//			System.out.print(i + " ");
//		}
		//�ʱ�� ����
		for ( ; min <= max; min++) {
			System.out.print(min + "");
		}
		
	}
	public void method4_1() {
		//���� �ϳ��� �Է¹޾� �� ���� 1~9������ ���϶��� �� ���� ������ ���
		//������ ���� ������ "1~9 ������ ����� �Է��Ͽ����մϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�  : ");
		int num1 = sc.nextInt();
		if (num1 >= 1 && num1 <= 9) {
			for (int num2 = 1; num2 <= 9;num2++) {
				System.out.println(num1 + "*" + num2 + "=" + num1*num2 );
			}
				
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");
		}
	}
	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		// Math.random(); // ������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
		// ����  Math.random()�� ���� : 0 <= Math.random() < 1
		// 10���� ����� ���� 10���ϱ� : 0 <= Math.random*10 < 10
		// 10�� �����ϱ� ���� 1���ϱ� : 1 <= Math.random*10+1 <= 11
		// ������ ����� ���� int����ȯ : 1 <= (int)(Math.random()*10+1) <11
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		System.out.println(random);
		for (int i=1; i <= random; i++) {
			sum +=i;
		}
		System.out.printf("1���� %d���� ���� �հ� : %d", random, sum);
	}
	
	public void method6() {
		//2�ܺ��� 9�ܱ��� ��� 
		for (int dan = 2; dan <= 9 ; dan++) {
			for(int su =1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan,su,(dan*su)); //printf �ٹٲ� %n,\n
			}
			System.out.println();
		}
	}
	public void method7() {
		//�Ƴ��α� �ð� ��� : 0�� 0�� ~ 23��59��
		for(int h = 0; h < 24; h++) {
			for(int min=0 ; min < 60; min++) {
				System.out.printf("%d�� %d��%n", h,min);
			}
			System.out.println();
		}
	}
	public void method8() {
		//���ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		// �� ���� ����ڰ� �Է��� ����ŭ ���
		/* 
		  	����� �� �� : 3
		  	*****
		  	*****
		  	*****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int l = sc.nextInt();
		for (int a = 1; a <= l; a++) {
		for(int i = 0; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public void method9() {
		//�� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ�� ��ŭ �Է�
		//��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
			/* 
			 	�� �� : 6
			 	ĭ �� : 6
			 	1*****
			 	*2****
			 	**3***
			 	***4**
			 	****5*
			 	*****6
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int l = sc.nextInt();
		System.out.print("ĭ �� : ");
		int k = sc.nextInt();
		for(int a = 1; a<=l; a++) {
		for (int b = 1; b<=k; b++) {
			if (a==b)
			{
				System.out.print(a);
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
		}	
	}
	
}
