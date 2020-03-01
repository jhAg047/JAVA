package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		//Thread1 ����
		Thread1 thread1 = new Thread1();
//		thread1.start(); // ���ν����尡 ������ ����
		//���θ޼ҵ尡 ������ �����尡 �ȳ����� ���� X
//		thread1.run(); // �ܼ� �޼ҵ� ȣ�� 
		
		//Thread2 ����
		Thread2 t2 = new Thread2();
//		t2.start(); Runnable���� start���� �׷��� �ϳ� �� ����������
		Thread thread2 = new Thread(t2);
//		thread2.start();
		
		//Thread3 ����
		Thread thread3 = new Thread3();
//		thread3.start();
		
//		thread1.start();
//		java.lang.IllegalThreadStateException : �� �� ����� ������� �ٽ� ȣ�� �Ұ� 
		
		//getPriority() : �������� �켱���� Ȯ�� / �⺻�� : 5
		System.out.println("t1 �켱���� : "+ thread1.getPriority());
		System.out.println("t2 �켱���� : "+ thread2.getPriority());
		System.out.println("t3 �켱���� : "+ thread3.getPriority());
		
		//�켱���� ���� : setPriority() / Thread.MAX_PRIORITY : 10 / Thread.MIN_PRIORITY :1
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY); //10
		thread3.setPriority(Thread.MIN_PRIORITY); //1
		System.out.println("t1 �켱���� : "+ thread1.getPriority());
		System.out.println("t2 �켱���� : "+ thread2.getPriority());
		System.out.println("t3 �켱���� : "+ thread3.getPriority());
	
		thread1.start();
		thread2.start();
		thread3.start();
		
		//join ��� 
		//join : �ڽ�(main thread)�� �ϴ� �۾��� ��� ���߰� �ٸ� ������(thread1,thread2,thread3)�� ������ �ð����� ����ǵ��� ��
		//���� ����ǰ� �ִ� ��ġ�� ���߰� �ٸ������尡 ����ǵ��� ��
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------main end");
	}
}
