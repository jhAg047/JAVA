package com.kh.example.chap01_thread.thread;

// 스레드 생성1 : Thread클래스 상속
public class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			setName("스레드"); //Thread 이름 지정
			System.out.println(getName() + " ON...");
			//getName() : 스레드 이름 반환
			
			try {
				Thread.sleep(500); //0.5초
				// sleep() :  스레드를 지연시키는 메소드 (1000 = 1s)
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 

		}
	}
}
