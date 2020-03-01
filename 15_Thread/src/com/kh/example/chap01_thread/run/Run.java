package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		//Thread1 생성
		Thread1 thread1 = new Thread1();
//		thread1.start(); // 메인스레드가 끝나고 실행
		//메인메소드가 끝나도 스레드가 안끝나면 종료 X
//		thread1.run(); // 단순 메소드 호출 
		
		//Thread2 생성
		Thread2 t2 = new Thread2();
//		t2.start(); Runnable에는 start없음 그래서 하나 더 만들어줘야함
		Thread thread2 = new Thread(t2);
//		thread2.start();
		
		//Thread3 생성
		Thread thread3 = new Thread3();
//		thread3.start();
		
//		thread1.start();
//		java.lang.IllegalThreadStateException : 한 번 종료된 스레드는 다시 호출 불가 
		
		//getPriority() : 스레드의 우선순위 확인 / 기본값 : 5
		System.out.println("t1 우선순위 : "+ thread1.getPriority());
		System.out.println("t2 우선순위 : "+ thread2.getPriority());
		System.out.println("t3 우선순위 : "+ thread3.getPriority());
		
		//우선순위 변경 : setPriority() / Thread.MAX_PRIORITY : 10 / Thread.MIN_PRIORITY :1
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY); //10
		thread3.setPriority(Thread.MIN_PRIORITY); //1
		System.out.println("t1 우선순위 : "+ thread1.getPriority());
		System.out.println("t2 우선순위 : "+ thread2.getPriority());
		System.out.println("t3 우선순위 : "+ thread3.getPriority());
	
		thread1.start();
		thread2.start();
		thread3.start();
		
		//join 사용 
		//join : 자신(main thread)이 하던 작업을 잠시 멈추고 다른 스레드(thread1,thread2,thread3)가 지정된 시간동안 실행되도록 함
		//내가 실행되고 있는 위치를 멈추고 다른스레드가 실행되도록 함
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
